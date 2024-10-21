package com.mycompany.java.project.db.controllers;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mycompany.java.project.classes.Book;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.db.Database;
import com.mycompany.java.project.db.ConnectionInformation;
import com.mycompany.java.project.interfaces.SQLQueries;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;

public class BookController extends Database implements SQLQueries {
    public BookController(){
        super();
    }

    public BookController(ConnectionInformation ci) throws JBookException {
        super(ci);
    }

    public ArrayList<Book> getBooks(String query) throws SQLException, JBookException {
        ArrayList<Book> books = new ArrayList<Book>();
        //เชื่อมต่อกับdatabase
        this.connect();
        //ดึงข้อมูลฺนนา ด้วยคำสั่ง Select
        this.select(query);
        while(this.rs.next()){
            //ดึงข้อมูลจากฐานข้อมูลของBook
            Book book = new Book()
                    .setBookId(this.rs.getInt("book_id"))
                    .setBookName(this.rs.getString("book_name"))
                    .setPrice(this.rs.getDouble("price"))
                    .setIsbn(this.rs.getString("isbn"))
                    .setAuthorName(this.rs.getString("author_name"))
                    .setImageUrl(this.rs.getString("image_url"))
                    .setRemain(this.rs.getInt("remain"))
                    .getInstance();
            //add ข้อมูลหนังสือลงArray
            books.add(book);
        }
        //force disconnect
        this.disconnect();
        return books;
    }

    public ArrayList<Book> getBooks() throws SQLException, JBookException {
        //ก็เชื่อมต่อกับdatabase
        return this.getBooks("SELECT * FROM books");
    }
    
    //get book เหมือนกัน เเต่เเค่ดึง instance เพื่อใช้ในหน้า preview
    public Book getBook(String query) throws SQLException, JBookException {
        Book book = null;
         //เชื่อมต่อกับdatabase
        this.connect();
        //ดึงข้อมูลฺนนา ด้วยคำสั่ง Select
        this.select(query);
        while(this.rs.next()){
            book = new Book()
                    .setBookId(this.rs.getInt("book_id"))
                    .setBookName(this.rs.getString("book_name"))
                    .setPrice(this.rs.getDouble("price"))
                    .setIsbn(this.rs.getString("isbn"))
                    .setAuthorName(this.rs.getString("author_name"))
                    .setImageUrl(this.rs.getString("image_url"))
                    .setRemain(this.rs.getInt("remain"))
                    .getInstance();
            break;
        }
        //force disconnect
        this.disconnect();
        return book;
    }
}

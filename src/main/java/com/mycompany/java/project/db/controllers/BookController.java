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

        this.connect();
        this.select(query);
        while(this.rs.next()){
            Book book = new Book()
                    .setBookId(this.rs.getInt("book_id"))
                    .setBookName(this.rs.getString("book_name"))
                    .setPrice(this.rs.getDouble("price"))
                    .setIsbn(this.rs.getString("isbn"))
                    .setAuthorName(this.rs.getString("author_name"))
                    .setImageUrl(this.rs.getString("image_url"))
                    .setRemain(this.rs.getInt("remain"))
                    .getInstance();
            books.add(book);
        }

        this.disconnect();
        return books;
    }

    public ArrayList<Book> getBooks() throws SQLException, JBookException {
        return this.getBooks("SELECT * FROM books");
    }

    public Book getBook(String query) throws SQLException, JBookException {
        Book book = null;

        this.connect();
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

        this.disconnect();
        return book;
    }
}

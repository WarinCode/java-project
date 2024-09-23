package com.mycompany.java.project.classes;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.interfaces.BookInterface;

public class Book implements BookInterface{
    private int bookId;
    private String bookName = null;
    private double price;
    private String isbn = null;
    private String authorName = null;
    private String imageUrl = null;
    private int remain;

    public Book(){}
    public Book(String bookName) throws JBookException{
        this.setBookName(bookName);
    }
    public Book(String bookName, double price) throws JBookException{
        this.setBookName(bookName).setPrice(price);
    }
    public Book(String bookName, double price, String isbn) throws JBookException{
        this.setBookName(bookName).setPrice(price).setIsbn(isbn);
    }
    public Book(Book book) throws JBookException{
        this.setBookName(book.getBookName())
                .setPrice(book.getPrice())
                .setIsbn(book.getIsbn())
                .setAuthorName(book.getAuthorName())
                .setImageUrl(book.getImageUrl())
                .setRemain(book.getRemain());
    }

    @Override
    public int getBookId(){
        return this.bookId;
    }

    @Override
    public String getBookName() {
        return this.bookName;
    }

    @Override
    public String getAuthorName() {
        return this.authorName;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getIsbn() {
        return this.isbn;
    }

    @Override
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Override
    public int getRemain() {
        return this.remain;
    }

    @Override
    public Book setBookId(int bookId) throws JBookException{
        if(bookId <= 0){
            throw new JBookException("Invalid book id!");
        }

        this.bookId = bookId;
        return this.getInstance();
    }

    @Override
    public Book setBookName(String bookName) throws JBookException {
        if(bookName != null && bookName.isEmpty()){
            throw new JBookException("Invalid book name!");
        }

        this.bookName = bookName;
        return this.getInstance();
    }

    @Override
    public Book setAuthorName(String authorName) throws JBookException {
        if(authorName != null && authorName.isEmpty()){
            throw new JBookException("Invalid author name!");
        }

        this.authorName = authorName;
        return this.getInstance();
    }

    @Override
    public Book setPrice(double price) throws JBookException {
        if(price <= 0){
            throw new JBookException("Invalid price!");
        }

        this.price = price;
        return this.getInstance();
    }

    @Override
    public Book setIsbn(String isbn) throws JBookException {
        if(isbn != null && isbn.isEmpty()){
            throw new JBookException("Invalid isbn number!");
        }

        this.isbn = isbn;
        return this.getInstance();
    }

    @Override
    public Book setImageUrl(String imageUrl) throws JBookException {
        if(imageUrl != null && imageUrl.isEmpty()){
            throw new JBookException("Invalid image url!");
        }

        this.imageUrl = imageUrl;
        return this.getInstance();
    }

    @Override
    public Book setRemain(int remain) throws JBookException {
        if(remain < 0){
            throw new JBookException("Invalid remain!");
        }

        this.remain = remain;
        return this.getInstance();
    }

    @Override
    public Book getInstance(){
        return this;
    }

    @Override
    public String toString(){
        return "id = " + this.getBookId() + ", bookName = " + this.getBookName() + ", price = " + this.getPrice() + ", isbn = " + this.getIsbn() + ", authorName = " + this.getAuthorName() + ", imageUrl = " + this.getImageUrl() + ", remain = " + this.getRemain();
    }
}

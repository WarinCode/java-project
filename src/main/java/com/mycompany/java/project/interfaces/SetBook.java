package com.mycompany.java.project.interfaces;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.classes.Book;

public interface SetBook {
    public Book setBookId(int bookId) throws JBookException;
    public Book setBookName(String bookName) throws JBookException;
    public Book setAuthorName(String authorName) throws JBookException;
    public Book setPrice(double price) throws JBookException;
    public Book setIsbn(String isbn) throws JBookException;
    public Book setImageUrl(String imageUrl) throws JBookException;
    public Book setRemain(int remain) throws JBookException;
}

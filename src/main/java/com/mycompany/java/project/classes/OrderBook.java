package com.mycompany.java.project.classes;
import com.mycompany.java.project.interfaces.BookInterface;
import com.mycompany.java.project.interfaces.InstanceProvider;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;

public class OrderBook extends Book implements BookInterface {
    private int quantity;

    public OrderBook(){
        super();
    }
    public OrderBook(String bookName) throws JBookException {
        super(bookName);
    }
    public OrderBook(String bookName, double price) throws JBookException {
        super(bookName, price);
    }
    public OrderBook(String bookName, String isbn) throws JBookException{
        super(bookName, isbn);
    }
    public OrderBook(String bookName, double price, String isbn) throws JBookException{
        super(bookName, price, isbn);
    }
    public OrderBook(Book book) throws JBookException{
        super(book);
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double getTotalPrice(){
        return this.getPrice() * this.getQuantity();
    }

    public OrderBook setQuantity(int quantity) throws JBookException {
        if(quantity < 0){
            throw new JBookException("Invalid quantity");
        }

        this.quantity = quantity;
        return this.getInstance();
    }

    @Override
    public OrderBook getInstance(){
        return this;
    }

    @Override
    public String toString(){
        return super.toString() + ", quantity = " + this.getQuantity();
    }
}

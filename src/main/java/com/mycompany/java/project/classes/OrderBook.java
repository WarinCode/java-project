package com.mycompany.java.project.classes;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.sql.Time;
import com.mycompany.java.project.classes.utils.Validator;
import com.mycompany.java.project.db.Database;
import com.mycompany.java.project.interfaces.BookInterface;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.interfaces.OrderInterface;

public class OrderBook extends Book implements BookInterface, OrderInterface {
    private int id;
    private int quantity;
    private double change;
    private Date date = null;
    private Time time = null;
    private String items = null;
    private double total;

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

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public Date getDate() {
        return this.date;
    }

    @Override
    public Time getTime() {
        return this.time;
    }

    @Override
    public String getItems() {
        return this.items;
    }

    public int getQuantity(){
        return this.quantity;
    }

    @Override
    public double getTotal() {
        return this.total;
    }

    @Override
    public double getChange() {
        return this.change;
    }

    @Override
    public OrderBook setId(int id) throws JBookException{
        if(id <= 0){
            throw new JBookException("Invalid id!");
        }

        this.id = id;
        return this.getInstance();
    }

    @Override
    public OrderBook setDate(Date date) throws JBookException {
        if(date == null){
            throw new JBookException("Invalid date time!");
        }

        this.date = date;
        return this.getInstance();
    }

    @Override
    public OrderBook setTime(Time time) throws JBookException {
        if(time == null){
            throw new JBookException("Invalid date time!");
        }

        this.time = time;
        return this.getInstance();
    }

    @Override
    public OrderBook setItems(String items) throws JBookException {
        if(Validator.isInvalidString(items)){
            throw new JBookException("Invalid items");
        }

        this.items = items;
        return this.getInstance();
    }

    @Override
    public OrderBook setQuantity(int quantity) throws JBookException {
        if(quantity < 0){
            throw new JBookException("Invalid quantity");
        }

        this.quantity = quantity;
        return this.getInstance();
    }

    @Override
    public OrderBook setTotal() throws JBookException {
        double total = this.getQuantity() * this.getPrice();
        if(total <= 0){
            throw new JBookException("Invalid total!");
        }

        this.total = total;
        return this.getInstance();
    }

    @Override
    public OrderBook setTotal(double total) throws JBookException {
        if(total <= 0){
            throw new JBookException("Invalid total!");
        }

        this.total = total;
        return this.getInstance();
    }

    @Override
    public OrderBook setChange(double change) throws JBookException {
        if(change < 0){
            throw new JBookException("Invalid change!");
        }

        this.change = change;
        return this.getInstance();
    }

    @Override
    public OrderBook getInstance(){
        return this;
    }

    @Override
    public String toString(){
        return super.toString() + ", id = " + this.getId() + ", quantity = " + this.getQuantity() + ", change = " + this.getChange() + ", date = " + this.getDate() + ", time = " + this.getTime() + ", items = " + this.getItems() + ", total = " + this.getTotal();
    }

    public static void main(String []args){
        try {
            Database db = new Database();
            System.out.println(db.getOrderBooks("SELECT * FROM sales_history"));

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

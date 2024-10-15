package com.mycompany.java.project.db.controllers;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mycompany.java.project.classes.OrderBook;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.db.Database;
import com.mycompany.java.project.db.ConnectionInformation;
import com.mycompany.java.project.interfaces.SQLQueries;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;

public class OrderBookController extends Database implements SQLQueries {
    public OrderBookController(){
        super();
    }

    public OrderBookController(ConnectionInformation ci) throws JBookException {
        super(ci);
    }

    public ArrayList<OrderBook> getOrderBooks(String query) throws SQLException, JBookException {
        ArrayList<OrderBook> orderBooks = new ArrayList<OrderBook>();

        this.connect();
        this.select(query);
        while(this.rs.next()){
            OrderBook orderBook = new OrderBook()
                    .setId(this.rs.getInt("id"))
                    .setDate(this.rs.getDate("date_time"))
                    .setTime(this.rs.getTime("date_time"))
                    .setItems(this.rs.getString("items"))
                    .setQuantity(this.rs.getInt("quantity"))
                    .setMoney(this.rs.getDouble("money"))
                    .setTotal(this.rs.getDouble("total"))
                    .setChange(this.rs.getDouble("change"))
                    .getInstance();
            orderBooks.add(orderBook);
        }

        this.disconnect();
        return orderBooks;
    }

    public OrderBook getOrderBook(String query) throws SQLException, JBookException {
        OrderBook orderBook = null;

        this.connect();
        this.select(query);
        while(this.rs.next()){
            orderBook = new OrderBook()
                    .setId(this.rs.getInt("id"))
                    .setDate(this.rs.getDate("date_time"))
                    .setTime(this.rs.getTime("date_time"))
                    .setItems(this.rs.getString("items"))
                    .setQuantity(this.rs.getInt("quantity"))
                    .setMoney(this.rs.getDouble("money"))
                    .setTotal(this.rs.getDouble("total"))
                    .setChange(this.rs.getDouble("change"))
                    .getInstance();
            break;
        }

        this.disconnect();
        return orderBook;
    }
}

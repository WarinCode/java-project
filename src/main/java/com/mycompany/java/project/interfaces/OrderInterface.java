package com.mycompany.java.project.interfaces;
import java.util.Date;
import java.sql.Time;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.classes.OrderBook;

public interface OrderInterface {
    public int getId();
    public Date getDate();
    public Time getTime();
    public String getItems();
    public int getQuantity();
    public double getTotal();
    public double getChange();
    public OrderBook setId(int id) throws JBookException;
    public OrderBook setDate(Date date) throws JBookException;
    public OrderBook setTime(Time time) throws JBookException;
    public OrderBook setItems(String items) throws JBookException;
    public OrderBook setQuantity(int quantity) throws JBookException;
    public OrderBook setTotal() throws JBookException;
    public OrderBook setTotal(double total) throws JBookException;
    public OrderBook setChange(double change) throws JBookException;
}

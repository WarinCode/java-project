package com.mycompany.java.project.interfaces;
import java.sql.Time;
import java.util.Date;
import com.mycompany.java.project.classes.OrderBook;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;

public interface SetOrder {
    public OrderBook setId(int id) throws JBookException;
    public OrderBook setDate(Date date) throws JBookException;
    public OrderBook setTime(Time time) throws JBookException;
    public OrderBook setItems(String items) throws JBookException;
    public OrderBook setQuantity(int quantity) throws JBookException;
    public OrderBook setTotal() throws JBookException;
    public OrderBook setTotal(double total) throws JBookException;
    public OrderBook setChange(double change) throws JBookException;
    public OrderBook setMoney(double money) throws JBookException;
}

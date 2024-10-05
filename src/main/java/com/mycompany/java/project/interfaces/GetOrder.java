package com.mycompany.java.project.interfaces;
import java.sql.Time;
import java.util.Date;

public interface GetOrder {
    public int getId();
    public Date getDate();
    public Time getTime();
    public String getItems();
    public int getQuantity();
    public double getTotal();
    public double getChange();
    public double getMoney();
}

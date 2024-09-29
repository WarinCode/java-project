package com.mycompany.java.project.interfaces;
import java.sql.Statement;
import java.sql.SQLException;

public interface SQLQueries {
    public void insert(String query) throws SQLException;
    public void update(String query) throws SQLException;
    public void delete(String query) throws SQLException;
}

package com.mycompany.java.project.interfaces;
import java.sql.Statement;
import java.sql.SQLException;

public interface SQLQueries {
    public int insert(String query) throws SQLException;
    public int update(String query) throws SQLException;
    public int delete(String query) throws SQLException;
}

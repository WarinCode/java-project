package com.mycompany.java.project.db;
import java.sql.SQLException;
import java.sql.DriverManager;
import com.mycompany.java.project.db.ConnectionInformation;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.classes.Book;
import com.mycompany.java.project.classes.OrderBook;
import com.mycompany.java.project.classes.User;
import com.mycompany.java.project.interfaces.SQLQueries;

public class Database extends DatabaseProvider implements SQLQueries {
    public boolean isChanged;

    public Database(){
        super();
    }

    public Database(ConnectionInformation ci) throws JBookException {
        super(ci);
    }

    @Override
    protected void connect() throws SQLException {
        this.connection = DriverManager.getConnection(this.ci.getUrl(), this.ci.getUsername(), this.ci.getPassword());
        this.statement = this.connection.createStatement();
    }

    @Override
    protected void disconnect() throws SQLException {
        if(this.rs != null){
            this.rs.close();
        }
        if(this.statement != null){
            this.statement.close();
        }
        if(this.connection != null){
            this.connection.close();
        }
    }

    @Override
    public void select(String query) throws SQLException {
        this.rs = this.statement.executeQuery(query);
    }

    @Override
    public void insert(String query) throws SQLException {
        this.execute(query);
    }

    @Override
    public void update(String query) throws SQLException {
        this.execute(query);
    }

    @Override
    public void delete(String query) throws SQLException {
        this.execute(query);
    }

    @Override
    protected void execute(String sql) throws SQLException {
        this.connect();
        this.isChanged = this.statement.executeUpdate(sql) == 1;
        this.disconnect();
    }
}

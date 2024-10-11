package com.mycompany.java.project.db;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvException;
import com.mycompany.java.project.db.ConnectionInformation;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.classes.Book;
import com.mycompany.java.project.classes.OrderBook;
import com.mycompany.java.project.classes.User;
import com.mycompany.java.project.interfaces.SQLQueries;

public class Database implements SQLQueries {
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet rs = null;
    private Dotenv dotenv = null;
    private ConnectionInformation ci = new ConnectionInformation();
    public boolean isChanged;

    public Database(){
        try {
            this.dotenv = Dotenv.configure()
                    .directory("src/main/java/com/mycompany/java/project/resources")
                    .filename("env")
                    .load();
            this.ci.setUsername(this.dotenv.get("USERNAME"))
                    .setPassword(this.dotenv.get("PASSWORD"))
                    .setDbName(this.dotenv.get("DB_NAME"))
                    .setPort(Integer.parseInt(this.dotenv.get("PORT")))
                    .setHost(this.dotenv.get("HOST"))
                    .setProjectName(this.dotenv.get("PROJECT_NAME"))
                    .setServiceName(this.dotenv.get("SERVICE_NAME"));
        } catch(DotenvException | NumberFormatException | JBookException e){
            e.printStackTrace();
//            System.exit(1);
        }
    }

    public Database(ConnectionInformation ci){
        this.ci = ci;
        if(this.ci == null){
            System.exit(1);
        }
    }

    private void connect() throws SQLException {
        this.connection = DriverManager.getConnection(this.ci.getUrl(), this.ci.getUsername(), this.ci.getPassword());
        this.statement = this.connection.createStatement();
    }

    private void disconnect() throws SQLException {
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

    private void execute(String sql) throws SQLException {
        this.connect();
        this.isChanged = this.statement.executeUpdate(sql) == 1;
        this.disconnect();
    }

    public ArrayList<Book> getBooks(String query) throws SQLException, JBookException {
        ArrayList<Book> books = new ArrayList<Book>();

        this.connect();
        this.select(query);
        while(this.rs.next()){
            Book book = new Book()
                    .setBookId(this.rs.getInt("book_id"))
                    .setBookName(this.rs.getString("book_name"))
                    .setPrice(this.rs.getDouble("price"))
                    .setIsbn(this.rs.getString("isbn"))
                    .setAuthorName(this.rs.getString("author_name"))
                    .setImageUrl(this.rs.getString("image_url"))
                    .setRemain(this.rs.getInt("remain"))
                    .getInstance();
            books.add(book);
        }

        this.disconnect();
        return books;
    }

    public Book getBook(String query) throws SQLException, JBookException {
        Book book = null;

        this.connect();
        this.select(query);
        while(this.rs.next()){
            book = new Book()
                    .setBookId(this.rs.getInt("book_id"))
                    .setBookName(this.rs.getString("book_name"))
                    .setPrice(this.rs.getDouble("price"))
                    .setIsbn(this.rs.getString("isbn"))
                    .setAuthorName(this.rs.getString("author_name"))
                    .setImageUrl(this.rs.getString("image_url"))
                    .setRemain(this.rs.getInt("remain"))
                    .getInstance();
            break;
        }

        this.disconnect();
        return book;
    }

    public User getUser(String query) throws SQLException, JBookException {
        User user = null;

        this.connect();
        this.select(query);
        while(this.rs.next()){
            user = new User()
                    .setUserId(this.rs.getInt("user_id"))
                    .setUsername(this.rs.getString("username"))
                    .setPassword(this.rs.getString("password"))
                    .setEmail(this.rs.getString("email"))
                    .setGender(this.rs.getString("gender"))
                    .setAvatar(this.rs.getString("avatar"))
                    .setAge(this.rs.getInt("age"))
                    .getInstance();
            break;
        }

        this.disconnect();
        return user;
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

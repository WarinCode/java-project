package com.mycompany.java.project.db;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvException;
import com.mycompany.java.project.db.ConnectionInformation;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.classes.Book;
import com.mycompany.java.project.classes.User;
import com.mycompany.java.project.interfaces.SQLQueries;

public class Database implements SQLQueries {
    private Connection connection = null;
    private Statement statement = null;
    private ResultSet rs = null;
    private Dotenv dotenv = null;
    private ConnectionInformation ci = new ConnectionInformation();

    public Database(){
        try {
            this.dotenv = Dotenv.configure().load();
            this.ci.setUsername(this.dotenv.get("USERNAME"))
                    .setPassword(this.dotenv.get("PASSWORD"))
                    .setDbName(this.dotenv.get("DB_NAME"))
                    .setPort(Integer.parseInt(this.dotenv.get("PORT")))
                    .setHost(this.dotenv.get("HOST"))
                    .setProjectName(this.dotenv.get("PROJECT_NAME"))
                    .setServiceName(this.dotenv.get("SERVICE_NAME"));
        } catch(DotenvException | NumberFormatException | JBookException e){
            e.printStackTrace();
            System.exit(1);
        }
    }

    private void connect() throws SQLException {
        this.connection = DriverManager.getConnection(this.ci.getUrl(), this.ci.getUsername(), this.ci.getPassword());
//        this.connection = DriverManager.getConnection(
//                "jdbc:mysql://avnadmin:AVNS_BkelXlquVHIRXirleTn@public-mysql-3912050c-java-project-493kjda.i.aivencloud.com:27653/jbook?ssl-mode=REQUIRED",
//                "avnadmin",
//                "AVNS_BkelXlquVHIRXirleTn"
//                );
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

    public ArrayList<Book> getBooks(String query) throws SQLException, JBookException {
        ArrayList<Book> books = new ArrayList<Book>();

        this.connect();
        this.rs = this.statement.executeQuery(query);

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

    public User getUser(String query) throws SQLException, JBookException {
        User user = null;

        this.connect();
        this.rs = this.statement.executeQuery(query);
        while(this.rs.next()){
            user = new User()
                    .setUserId(this.rs.getInt("user_id"))
                    .setUsername(this.rs.getString("username"))
                    .setPassword(this.rs.getString("password"))
                    .setEmail(this.rs.getString("email"))
                    .setGender(this.rs.getString("gender"))
                    .getInstance();
        }

        this.disconnect();
        return user;
    }

    private int execute(String sql) throws SQLException {
        this.connect();
        int result = this.statement.executeUpdate(sql);
        this.disconnect();
        return result;
    }

    @Override
    public int insert(String query) throws SQLException {
        return this.execute(query);
    }

    @Override
    public int update(String query) throws SQLException {
        return this.execute(query);
    }

    @Override
    public int delete(String query) throws SQLException {
        return this.execute(query);
    }

    public static void main(String []args){
        try {
            Database db = new Database();
            System.out.println(db.getBooks("SELECT * FROM books"));
        } catch(SQLException | JBookException e){
            e.printStackTrace();
        }
    }
}

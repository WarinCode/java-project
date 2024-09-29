package com.mycompany.java.project;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mycompany.java.project.db.Authorization;
import com.mycompany.java.project.db.Database;
import com.mycompany.java.project.pages.Login;
import com.mycompany.java.project.pages.Home;
import com.mycompany.java.project.classes.Book;
import com.mycompany.java.project.classes.User;

public class JavaProject {
    public static void main(String[] args) {
        try {
            if(!Authorization.isLoggedIn){
                Login login = new Login();
            } else {
                Database db = new Database();
                User user = db.getUser("SELECT * FROM users WEHRE user_id = " + Authorization.authorizedUserId);
                ArrayList<Book> books = db.getBooks("SELECT * FROM books");
                Home home = new Home(user, books);
            }
        } catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
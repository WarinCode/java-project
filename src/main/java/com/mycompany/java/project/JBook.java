package com.mycompany.java.project;
import java.util.ArrayList;
import com.mycompany.java.project.db.Authorization;
import com.mycompany.java.project.db.controllers.BookController;
import com.mycompany.java.project.db.controllers.UserController;
import com.mycompany.java.project.pages.Login;
import com.mycompany.java.project.pages.Home;
import com.mycompany.java.project.classes.Book;
import com.mycompany.java.project.classes.User;

public class JBook {
    public static void main(String[] args) {
        try {
            if(!Authorization.isLoggedIn){
                Login login = new Login();
            } else {
                BookController bookController = new BookController();
                UserController userController = new UserController();
                User user = userController.getUser("SELECT * FROM users WEHRE user_id = " + Authorization.authorizedUserId);
                ArrayList<Book> books = bookController.getBooks("SELECT * FROM books");
                Home home = new Home(user, books);
            }
        } catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
package com.mycompany.java.project.db;
import java.sql.SQLException;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.classes.User;
import static com.mycompany.java.project.classes.utils.Helper.getSingleQuotes;
import com.mycompany.java.project.interfaces.PageHandling;
import com.mycompany.java.project.interfaces.UserInterface;

public final class Authorization {
    public static int authorizedUserId;
    public static boolean isValidUser;
    public static boolean isLoggedIn;

    public static boolean isAuthorized(User userParam) throws SQLException, JBookException {
        Database db = new Database();
        String query = "SELECT * FROM users WHERE (username = " + getSingleQuotes(userParam.getUsername()) + " OR email = " + getSingleQuotes(userParam.getEmail()) + ") AND password = " + getSingleQuotes(userParam.getPassword());
//        System.out.println(query);
        User user = db.getUser(query);
        isValidUser = user != null;

        if(isValidUser){
            authorizedUserId = user.getUserId();
            System.out.println("The user has successfully logged in.");
            isLoggedIn = true;
        }

        return isValidUser;
    }

    public static void accessDenied(PageHandling page){
        isValidUser = false;
        authorizedUserId = 0;
        isLoggedIn = false;
        page.destroy();
    }
}

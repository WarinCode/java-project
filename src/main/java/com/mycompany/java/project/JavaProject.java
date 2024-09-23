package com.mycompany.java.project;
import java.sql.SQLException;
import com.mycompany.java.project.classes.User;
import com.mycompany.java.project.classes.utils.Helper;
import com.mycompany.java.project.db.Authorization;
import com.mycompany.java.project.db.Database;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.interfaces.Registration;

public class JavaProject {

    public static void main(String[] args) {
        try {
            User checkUser = new User("root", "1234");
            if(Authorization.isAuthorized(checkUser)){
                Database db = new Database();
                User user = db.getUser("SELECT * FROM users WHERE user_id = " + Authorization.authorizedUserId);
                System.out.println(user);
            }
        } catch(SQLException | JBookException e){
            e.printStackTrace();
        }
    }
}

package com.mycompany.java.project;
import java.sql.SQLException;
import com.mycompany.java.project.classes.User;
import com.mycompany.java.project.db.Authorization;
import com.mycompany.java.project.db.Database;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.pages.Login;

public class JavaProject {
    public static void main(String[] args) {
        if(!Authorization.isLoggedIn){
            Login login = new Login();
        } else {

        }
    }
}

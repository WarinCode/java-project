package com.mycompany.java.project.db.controllers;
import java.sql.SQLException;
import com.mycompany.java.project.classes.User;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.db.ConnectionInformation;
import com.mycompany.java.project.db.Database;
import com.mycompany.java.project.db.Authorization;
import com.mycompany.java.project.interfaces.SQLQueries;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;

public class UserController extends Database implements SQLQueries {
    public UserController(){
        super();
    }

    public UserController(ConnectionInformation ci) throws JBookException {
        super(ci);
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
}

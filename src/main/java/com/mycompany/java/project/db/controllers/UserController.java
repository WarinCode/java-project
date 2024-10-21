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

        //เชื่อมต่อกับdatabase
        this.connect();
        //ดึงข้อมูลUser ด้วยคำสั่ง Select
        this.select(query);
        //ถ้ายังมีUser
        while(this.rs.next()){
            //ดึงข้อมูลจากฐานข้อมูลของUser 
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
        //force disconnect
        this.disconnect();
        return user;
    }


    public User getUser() throws SQLException, JBookException {
        //ถ้าlogin อยู่เเล้ว
        if(!Authorization.isLoggedIn || Authorization.authorizedUserId <= 0){
            return null;
        }
        //ก็เชื่อมต่อกับdatabase
        return this.getUser("SELECT * FROM users WHERE user_id = " + Authorization.authorizedUserId);
    }
}

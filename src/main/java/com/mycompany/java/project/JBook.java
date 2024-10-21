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
            //check ถ้าuser ยังไม่ logged in
            if(!Authorization.isLoggedIn){
                //เปิดหน้า page login
                Login login = new Login();
            } else {
                //เตรียมโหลด database ข้อมูลหนังสือ
                BookController bookController = new BookController();
                //เตรียมโหลด database ข้อมูลUser
                UserController userController = new UserController();
                //โหลด ข้อมูลUser จาก User
                User user = userController.getUser("SELECT * FROM users WEHRE user_id = " + Authorization.authorizedUserId);
                //โหลดเก็บArray ของข้อมูลหนังสือ เพื่อใช้เเสดงผล
                ArrayList<Book> books = bookController.getBooks("SELECT * FROM books");
                //เเสดงหน้า page Home
                Home home = new Home(user, books);
            }
        } catch(Exception e){
            e.printStackTrace();
            System.exit(1);
        }
    }
}
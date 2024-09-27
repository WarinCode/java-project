package com.mycompany.java.project.classes.utils;
import java.sql.SQLException;
import com.mycompany.java.project.classes.User;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.db.Authorization;
import com.mycompany.java.project.db.Database;
import static com.mycompany.java.project.classes.utils.Helper.getSingleQuotes;

public final class Validator {
    public static boolean isValidString(String value){
        if(value == null || value.isEmpty() || value.isBlank()) {
            return false;
        }
        return true;
    }

    public static boolean isInvalidString(String value){
        return !isValidString(value);
    }

    public static boolean isDuplicateUser(User user) throws SQLException, JBookException {
        return Authorization.isAuthorized(user);
    }

    public static boolean isDuplicateUser(int userId, String username, String email) throws SQLException, JBookException {
        Database db = new Database();
        return db.getUser("SELECT * FROM users WHERE (username = " + getSingleQuotes(username) + "AND email = " + getSingleQuotes(email) + ") AND user_id != " + userId) != null;
    }
}

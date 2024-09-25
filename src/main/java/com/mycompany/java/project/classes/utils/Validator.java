package com.mycompany.java.project.classes.utils;
import java.sql.SQLException;
import com.mycompany.java.project.classes.User;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.db.Authorization;
import java.sql.SQLException;

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
}

package com.mycompany.java.project.interfaces;
import java.sql.SQLException;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.classes.User;
import com.mycompany.java.project.db.Database;
import com.mycompany.java.project.classes.utils.Validator;
import com.mycompany.java.project.classes.utils.Helper;
import static com.mycompany.java.project.classes.utils.Helper.getSingleQuotes;

public interface Registration {
    public static void createUser(User user) throws SQLException, JBookException {
        if(Validator.isDuplicateUser(user)){
            Helper.isAccountCreated = false;
            throw new JBookException("An error occurred. This user is already in use!");
        }
        if(Validator.isInvalidString(user.getEmail())){
            Helper.isAccountCreated = false;
            throw new JBookException("An error occurred. Email name cannot be empty!");
        }

        Database db = new Database();
        String query = "INSERT INTO users VALUES(DEFAULT(user_id), " + getSingleQuotes(user.getUsername()) + ", " + getSingleQuotes(user.getPassword()) + ", " + getSingleQuotes(user.getEmail()) + ", " + getSingleQuotes(user.getGender()) + ")";
        Helper.isAccountCreated = db.insert(query) == 1;

        if(Helper.isAccountCreated){
            System.out.println("User account created successfully.");
        }
    }
}

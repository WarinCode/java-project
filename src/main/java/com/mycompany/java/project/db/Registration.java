package com.mycompany.java.project.db;
import java.sql.SQLException;
import com.mycompany.java.project.classes.User;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.classes.utils.Validator;
import static com.mycompany.java.project.classes.utils.Helper.getSingleQuotes;

public final class Registration {
    public static boolean isAccountCreated;

    public static void createUser(User user) throws SQLException, JBookException {
        isAccountCreated = false;
        if(Validator.isDuplicateUser(user)){
            throw new JBookException("An error occurred. This user is already in use!");
        }
        if(Validator.isInvalidString(user.getEmail())){
            throw new JBookException("An error occurred. Email name cannot be empty!");
        }

        Database db = new Database();
        String query = "INSERT INTO users VALUES(DEFAULT(user_id), " + getSingleQuotes(user.getUsername()) + ", " +
                getSingleQuotes(user.getPassword()) + ", " + getSingleQuotes(user.getEmail()) + ", " +
                getSingleQuotes(user.getGender()) + ", DEFAULT(gender), DEFAULT(avatar))";
//        System.out.println(query);
        isAccountCreated = db.insert(query) == 1;

        if(isAccountCreated){
            System.out.println("User account created successfully.");
            return;
        }

        throw new JBookException("An error occurred. Email name cannot be empty!");
    }
}

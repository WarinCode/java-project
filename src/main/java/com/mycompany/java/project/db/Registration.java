package com.mycompany.java.project.db;
import java.sql.SQLException;
import com.mycompany.java.project.classes.User;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.classes.customs.exceptions.RegistrationException;
import com.mycompany.java.project.classes.utils.Validator;
import static com.mycompany.java.project.classes.utils.Helper.getSingleQuotes;

public final class Registration {
    public static boolean isAccountCreated;

    public static void createUser(User user) throws SQLException, RegistrationException, JBookException {
        isAccountCreated = false;

        if(Validator.isDuplicateUser(user)){
            throw new RegistrationException("An error occurred. This user is already in use!");
        }
        if(Validator.isInvalidString(user.getEmail())){
            throw new RegistrationException("An error occurred. Email name cannot be empty!");
        }

        Database db = new Database();
        String query = "INSERT INTO users(username, password, email) VALUES("
                + getSingleQuotes(user.getUsername())
                + ", " + getSingleQuotes(user.getPassword())
                + ", " + getSingleQuotes(user.getEmail()) + ")";
//        System.out.println(query);
        db.insert(query);
        isAccountCreated = db.isChanged;

        if(isAccountCreated){
            return;
        }

        throw new RegistrationException("Something went wrong!");
    }
}

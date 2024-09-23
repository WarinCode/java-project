package com.mycompany.java.project.classes;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.interfaces.UserInterface;
import com.mycompany.java.project.classes.utils.Validator;

public class User implements UserInterface {
    private int userId;
    private String username = null;
    private String password = null;
    private String email = null;
    private String gender = null;

    public User(){}
    public User(String username) throws JBookException {
        this.setUsername(username);
    }
    public User(int userId) throws JBookException {
        this.setUserId(userId);
    }
    public User(String username, String password) throws JBookException{
        this.setUsername(username).setPassword(password);
    }
    public User(String username, String password, String email) throws JBookException {
        this.setUsername(username).setPassword(password).setEmail(email);
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public int getUserId() {
        return this.userId;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public User getInstance() {
        return this;
    }


    @Override
    public User setUserId(int userId) throws JBookException {
        if(userId <= 0 && Validator.isInvalidString(Integer.toString(userId))){
            throw new JBookException("Invalid user id!");
        }

        this.userId = userId;
        return this.getInstance();
    }

    @Override
    public User setUsername(String username) throws JBookException {
        if(Validator.isInvalidString(username)){
            throw new JBookException("Invalid username!");
        }

        this.username = username;
        return this.getInstance();
    }

    @Override
    public User setPassword(String password) throws JBookException {
        if(Validator.isInvalidString(password)){
            throw new JBookException("Invalid password!");
        }

        this.password = password;
        return this.getInstance();
    }

    @Override
    public User setEmail(String email) throws JBookException {
        if(Validator.isInvalidString(email)){
            throw new JBookException("Invalid email!");
        }

        this.email = email;
        return this.getInstance();
    }

    @Override
    public User setGender(String gender) throws JBookException {
        if(gender != null && Validator.isInvalidString(gender)){
            throw new JBookException("Invalid gender!");
        }

        this.gender = gender;
        return this.getInstance();
    }

    @Override
    public String toString(){
        return "userId = " + this.getUserId() + ", username = " + this.getUsername() + ", password = " + this.getPassword() + ", email = " + this.getEmail() + ", gender = " + this.getGender();
    }
}

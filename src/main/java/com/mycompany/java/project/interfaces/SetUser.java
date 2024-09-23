package com.mycompany.java.project.interfaces;
import com.mycompany.java.project.classes.User;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;

public interface SetUser {
    public User setUserId(int userId) throws JBookException;
    public User setUsername(String username) throws JBookException;
    public User setPassword(String password) throws JBookException;
    public User setEmail(String email) throws JBookException;
    public User setGender(String gender) throws JBookException;
}

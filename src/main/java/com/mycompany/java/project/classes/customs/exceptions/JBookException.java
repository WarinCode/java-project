package com.mycompany.java.project.classes.customs.exceptions;

public class JBookException extends Exception {
    public JBookException(){
        super();
    }
    public JBookException(String message){
        super(message);
    }
    public JBookException(String message, Throwable cause) {
        super(message, cause);
    }
    public JBookException(Throwable cause) {
        super(cause);
    }
}

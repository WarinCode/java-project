package com.mycompany.java.project.classes.customs.exceptions;

public class RegistrationException extends Exception {
    public RegistrationException(){
        super();
    }
    public RegistrationException(String message){
        super(message);
    }
    public RegistrationException(String message, Throwable cause) {
        super(message, cause);
    }
    public RegistrationException(Throwable cause) {
        super(cause);
    }
}

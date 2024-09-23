package com.mycompany.java.project.db;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;
import com.mycompany.java.project.classes.utils.Validator;
import com.mycompany.java.project.interfaces.InstanceProvider;

public class ConnectionInformation implements InstanceProvider<ConnectionInformation>{
    private String username = null;
    private String password = null;
    private String dbName = null;
    private int port;
    private String url = null;
    private String host = null;
    private String serviceName = null;
    private String projectName = null;

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public String getDbName(){
        return this.dbName;
    }

    public int getPort(){
        return this.port;
    }

    public String getUrl(){
        this.setUrl();
        return this.url;
    }

    public String getHost(){
        return this.host;
    }

    public String getServiceName(){
        return this.serviceName;
    }

    public String getProjectName(){
        return this.projectName;
    }

    public ConnectionInformation setUsername(String username) throws JBookException {
        if(!Validator.isValidString(username)){
            throw new JBookException("Invalid username!");
        }

        this.username = username;
        return this.getInstance();
    }

    public ConnectionInformation setPassword(String password) throws JBookException {
        if(!Validator.isValidString(password)){
            throw new JBookException("Invalid password!");
        }

        this.password = password;
        return this.getInstance();
    }

    public ConnectionInformation setDbName(String dbName) throws JBookException {
        if(!Validator.isValidString(dbName)){
            throw new JBookException("Invalid database name!");
        }

        this.dbName = dbName;
        return this.getInstance();
    }

    public ConnectionInformation setPort(int port) throws JBookException {
        if(port <= 0 && !Validator.isValidString(Integer.toString(port))){
            throw new JBookException("Invalid port!");
        }

        this.port = port;
        return this.getInstance();
    }

    private ConnectionInformation setUrl(){
        this.url = "jdbc:mysql://" + this.getUsername() + ":" + this.getPassword() + "@" + this.getHost() + ":" + this.getPort() + "/" + this.getDbName() + "?ssl-mode=REQUIRED";
        return this.getInstance();
    }

    public ConnectionInformation setHost(String host) throws JBookException {
        if(!Validator.isValidString(host)){
            throw new JBookException("Invalid host!");
        }

        this.host = host;
        return this.getInstance();
    }

    public ConnectionInformation setServiceName(String serviceName) throws JBookException {
        if(!Validator.isValidString(serviceName)){
            throw new JBookException("Invalid service!");
        }

        this.serviceName = serviceName;
        return this.getInstance();
    }

    public ConnectionInformation setProjectName(String projectName) throws JBookException {
        if(!Validator.isValidString(projectName)){
            throw new JBookException("Invalid project name!");
        }

        this.projectName = projectName;
        return this.getInstance();
    }

    public ConnectionInformation getInstance(){
        return this;
    }
}

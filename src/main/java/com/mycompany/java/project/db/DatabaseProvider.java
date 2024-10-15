package com.mycompany.java.project.db;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import io.github.cdimascio.dotenv.Dotenv;
import io.github.cdimascio.dotenv.DotenvException;
import com.mycompany.java.project.classes.customs.exceptions.JBookException;

public abstract class DatabaseProvider {
    protected Connection connection = null;
    protected Statement statement = null;
    protected ResultSet rs = null;
    protected Dotenv dotenv = null;
    protected ConnectionInformation ci = new ConnectionInformation();

    protected DatabaseProvider(){
        try {
            this.dotenv = Dotenv.configure().load();
            this.ci.setUsername(this.dotenv.get("USERNAME"))
                    .setPassword(this.dotenv.get("PASSWORD"))
                    .setDbName(this.dotenv.get("DB_NAME"))
                    .setPort(Integer.parseInt(this.dotenv.get("PORT")))
                    .setHost(this.dotenv.get("HOST"))
                    .setProjectName(this.dotenv.get("PROJECT_NAME"))
                    .setServiceName(this.dotenv.get("SERVICE_NAME"));
        } catch(DotenvException | NumberFormatException | JBookException e){
            e.printStackTrace();
        }
    }

    protected DatabaseProvider(ConnectionInformation ci) throws JBookException {
        if(ci == null){
            throw new JBookException("Database connection settings are invalid!");
        }
        this.ci = ci;
    }

    protected abstract void connect() throws SQLException;
    protected abstract void disconnect() throws SQLException;
    protected abstract void execute(String sql) throws SQLException;
}

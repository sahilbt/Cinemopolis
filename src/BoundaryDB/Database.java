package BoundaryDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Database{

    final String USERNAME = "ensf480";
    final String PASSWORD = "password";
    final String URL = "jdbc:mysql://localhost/cinemopolis";
    protected Connection dbConnect;


    public void initializeConnection() {
        try {
            this.dbConnect = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    };
    public void closeConnection(){
        try {
            this.dbConnect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection(){
        return dbConnect;
    }

}


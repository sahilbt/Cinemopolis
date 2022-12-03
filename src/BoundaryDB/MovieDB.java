package BoundaryDB;


import java.sql.*;
import java.util.*;
public class MovieDB implements Database {
    
    private Connection dbConnect;

    public MovieDB(){
        initializeConnection();
    }


    @Override
    public void initializeConnection() {
        try {
            this.dbConnect = DriverManager.getConnection(Database.URL, Database.USERNAME, Database.PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();        
        }
    }

    public void closeConnection(){
        try {
            this.dbConnect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

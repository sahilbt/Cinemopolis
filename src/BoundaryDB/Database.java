package BoundaryDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Database{

    //Class variables for the database abstract class
    final String USERNAME = "ensf480";
    final String PASSWORD = "password";
    final String URL = "jdbc:mysql://localhost/cinemopolis";
    protected Connection dbConnect;

    /**
     * Initializes the connection to the MySQL server
     * 
     * @param None
     */
    public void initializeConnection() {
        try {
            this.dbConnect = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    };


    /**
     * Closes the connection to the MySQL server
     * 
     * @param None
     */
    public void closeConnection(){
        try {
            this.dbConnect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * Gets the connection to the MySQL server
     * 
     * @param None
     */
    public Connection getConnection(){
        return dbConnect;
    }

}


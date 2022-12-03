package BoundaryDB;

import Entitity.*;
import java.sql.*;
import java.util.*;


public class TicketDB implements Database{
    

    private Connection dbConnect;

    public TicketDB(){
        initializeConnection();
        }
        

    


        public void initializeConnection() {
            try {
                this.dbConnect = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }





}

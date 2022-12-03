package BoundaryDB;
import Entitity.*;
import java.sql.*;
import java.util.*;
public class TicketDB implements Database {
    private Connection dbConnect;    

    public TicketDB(){
        initializeConnection();
    }


    public boolean exists(int id){
        try {
            String query = "SELECT * FROM tickets";
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);
            while (set.next()) {
                if(set.getInt(1) == id){
                    return true;
                }
            }
            stmt.close();
            set.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    public Ticket getTicket(int id){
        Ticket t = new Ticket();
        try {
            String query = "SELECT * FROM tickets WHERE ID = " + Integer.toString(id);
            Statement stmt = dbConnect.createStatement();
            ResultSet res = stmt.executeQuery(query);
            res.next();

            String seatsDB = res.getString(4);
            String[] split = seatsDB.split(" ");
            ArrayList<Integer> seatIDs = new ArrayList<Integer>();

            for(String s : split){
                seatIDs.add(Integer.parseInt(s));
            }

            t = new Ticket(res.getInt(1), res.getString(8), res.getString(5), res.getString(7), 
                                  res.getString(3), seatIDs, res.getInt(9), res.getBoolean(2), 
                                  res.getString(6));
        } catch (SQLException e) {
            e.printStackTrace();
        }     
        return t;
    }

    public void initializeConnection() {
        try {
            this.dbConnect = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

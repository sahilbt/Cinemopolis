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
            String query = "SELECT * FROM tickets WHERE ID = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet res = stmt.executeQuery();

            if(!res.first()){
                return false;
            }
            return true;
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }


    public Ticket getTicket(int id){
        Ticket t = new Ticket();
        try {
            String query = "SELECT * FROM tickets WHERE ID = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet res = stmt.executeQuery();
            res.first();

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

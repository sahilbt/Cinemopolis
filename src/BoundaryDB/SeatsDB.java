package BoundaryDB;

import java.sql.*;
import java.util.*;
import Entitity.*;

public class SeatsDB extends Database{

    /**
     * Constructor for the MovieDB class
     * 
     * @param None
     */
    public SeatsDB(){
        initializeConnection();
    }

    /**
     * Gets the seats from the database based on a showtime
     * 
     * @param s Showtime object where we find its showtimes
     */
    public ArrayList<Seat> getSeatsFromDB(Showtime s) {
        ArrayList<Seat> DBUser = new ArrayList<Seat>();
        try {
            //Query to find all the seats based on a showtime
            String query = "SELECT * FROM seats WHERE ShowtimeID = " + Integer.toString(s.getID());
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);

            //Iterate through all the seats and set the values
            while (set.next()) {
                int showtimeID = set.getInt("ShowtimeID");
                int SeatID = set.getInt("ID");
                boolean Ruser = set.getBoolean("RUser");
                boolean Vacancy = set.getBoolean("Vacancy");
                DBUser.add(new Seat(Vacancy,SeatID,showtimeID,Ruser));
            }
            stmt.close();
            set.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        s.setSeats(DBUser);
        return DBUser;
    }


    /**
     * updates the seats in the database
     * 
     * @param seats ArrayList of seats to be updated
     */
    public void updateSeatsinDB(ArrayList<Integer> seats){
        try {
            //Query to update the seats 
            String query = "UPDATE seats SET Vacancy = ? WHERE ID = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            for(int val : seats){
                stmt.setBoolean(1, false);
                stmt.setInt(2, val);
                stmt.executeUpdate();
                }
        } catch (SQLException e) {
            e.printStackTrace();
            }
    }
}

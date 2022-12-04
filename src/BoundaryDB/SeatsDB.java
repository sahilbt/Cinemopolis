package BoundaryDB;

import java.sql.*;
import java.util.*;
import Entitity.*;

public class SeatsDB extends Database{



    public SeatsDB(){
        initializeConnection();
    }

    public ArrayList<Seat> getSeatsFromShowtime(Showtime s) {
        ArrayList<Seat> DBUser = new ArrayList<Seat>();
        try {
            String query = "SELECT * FROM seats WHERE ShowtimeID = " + Integer.toString(s.getID());
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);
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

    public void bookSeat(ArrayList<Integer> seats){
        try {
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

package BoundaryDB;

import java.sql.*;
import java.util.*;
import Entitity.*;

public class ShowtimeDB implements Database{

    private Connection dbConnect;


    public ShowtimeDB(){
        initializeConnection();
    }

    public ArrayList<Showtime> getShowtimesFromMovie(int id) {
        ArrayList<Showtime> DBUser = new ArrayList<>();
        try {
            String query = "SELECT * FROM Movies WHERE MovieID = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet set = stmt.executeQuery(query);
            while (set.next()) {
                int MovieID = set.getInt("MovieID");
                int ShowtimeID = set.getInt("ID");
                String Time = set.getString("TIme");
                DBUser.add(new Showtime(ShowtimeID,MovieID,Time));
            }
            stmt.close();
            set.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DBUser;
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

package BoundaryDB;

import java.sql.*;
import java.util.*;
import Entitity.*;

public class ShowtimeDB extends Database{


    public ShowtimeDB(){
        initializeConnection();
    }

    

    public ArrayList<Showtime> getShowtimesFromDB(Movie movie) {
        ArrayList<Showtime> dbMovies = new ArrayList<Showtime>();
        try {
            String query = "SELECT * FROM showtimes WHERE MovieID = " + Integer.toString(movie.getID());
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);
            while (set.next()) {
                int MovieID = set.getInt("MovieID");
                int ShowtimeID = set.getInt("ID");
                String Time = set.getString("TIme");
                dbMovies.add(new Showtime(ShowtimeID,MovieID,Time));
            }
            stmt.close();
            set.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        movie.setShowTimes(dbMovies);
        return dbMovies;
    }
}

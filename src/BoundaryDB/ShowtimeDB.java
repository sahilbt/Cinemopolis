package BoundaryDB;

import java.sql.*;
import java.util.*;
import Entitity.*;

public class ShowtimeDB extends Database{

    /**
     * Constructor for the ShowtimeDB class
     * 
     * @param None
     */
    public ShowtimeDB(){
        initializeConnection();
    }

    /**
     * Getting the showtimes from the database basd on a movie
     * 
     * @param movie The movie object that we will need to get the showtimes for 
     */
    public ArrayList<Showtime> getShowtimesFromDB(Movie movie) {
        ArrayList<Showtime> dbMovies = new ArrayList<Showtime>();
        try {
            //Query to get the showtimes for a particular movie
            String query = "SELECT * FROM showtimes WHERE MovieID = " + Integer.toString(movie.getID());
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);

            //Iterating to get the showtime objects for the movie id
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
        //Iterating to set the showtime objects for the movie object
        movie.setShowTimes(dbMovies);
        return dbMovies;
    }
}

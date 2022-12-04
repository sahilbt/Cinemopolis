package BoundaryDB;


import java.sql.*;
import java.util.*;

import Entitity.*;

public class MovieDB extends Database{
    
 
    public MovieDB(){
        initializeConnection();
    }


    public ArrayList<Movie> getMoviesFromTheatre(Theatre theatre) {
        ArrayList<Movie> DBMovies = new ArrayList<Movie>();
        try {
            String query = "SELECT * FROM movies WHERE TheatreID = " + Integer.toString(theatre.getID());
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);
            while (set.next()) {
                int movieID = set.getInt("ID");
                int theatreID = set.getInt("TheatreID");
                String name = set.getString("Name");
                DBMovies.add(new Movie(name,theatreID,movieID));
            }
            stmt.close();
            set.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        theatre.setMovieList(DBMovies);
        return DBMovies;
    }

    public String getMovieNameFromTheatre(int MovieID,int TheatreID,Theatre theatre){
        ArrayList<Movie> MovieList = theatre.getMovieList();
        for(Movie val : MovieList){
            if(MovieID == val.getID()){
                return val.getMovieName();
            }
        }
        return null;
    }

    public boolean checkMovieSearch(int TheatreID,String MovieName,Theatre theatre){
        ArrayList<Movie> MovieList = theatre.getMovieList();
        for(Movie val : MovieList){
            if(MovieName.equals(val.getMovieName())){
                return true;
            }
        }
        return false;
    }
}

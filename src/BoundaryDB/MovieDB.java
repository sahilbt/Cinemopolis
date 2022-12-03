package BoundaryDB;


import java.sql.*;
import java.util.*;

import Entitity.*;

public class MovieDB implements Database{
    
    private Connection dbConnect;
 


    public MovieDB(){
        initializeConnection();
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

    
    public ArrayList<Movie> getMoviesFromTheatre(Theatre theatre) {
        ArrayList<Movie> DBMovies = new ArrayList<>();
        try {
            String query = "SELECT * FROM Movies WHERE TheatreID = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, theatre.getID());
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

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

    
    public ArrayList<Movie> getMoviesFromTheatre(int id) {
        ArrayList<Movie> DBUser = new ArrayList<>();
        try {
            String query = "SELECT * FROM Movies WHERE TheatreID = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet set = stmt.executeQuery(query);
            while (set.next()) {
                int MovieID = set.getInt("ID");
                int TheatreID = set.getInt("TheatreID");
                String Name = set.getString("Name");
                DBUser.add(new Movie(Name,TheatreID,MovieID));
            }
            stmt.close();
            set.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DBUser;
    }

    public String getMovieNameFromTheatre(int MovieID,int TheatreID){
        ArrayList<Movie> MovieList = getMoviesFromTheatre(TheatreID);

        for(Movie val : MovieList){
            if(MovieID == val.getID()){
                return val.getMovieName();
            }
        }
        return null;
    }

    public boolean checkMovieSearch(int TheatreID,String MovieName){
        ArrayList<Movie> MovieList = getMoviesFromTheatre(TheatreID);
        for(Movie val : MovieList){
            if(MovieName.equals(val.getMovieName())){
                return true;
            }
        }
        return false;

    }



}

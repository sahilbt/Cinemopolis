package BoundaryDB;


import java.sql.*;
import java.util.*;

import Entitity.*;

public class MovieDB extends Database{
    
    /**
     * Constructor for the MovieDB class
     * 
     * @param None
     */
    public MovieDB(){
        initializeConnection();
    }


    /**
     * Gets all the movies for a certain theatre from the database
     * 
     * @param theatre The theatre object that will be checked
     */
    public ArrayList<Movie> getMoviesFromDB(Theatre theatre) {
        ArrayList<Movie> DBMovies = new ArrayList<Movie>();
        try {
            // Query to find the largest id from the movies table
            String query = "SELECT * FROM movies WHERE ID = (SELECT MAX(ID) FROM movies)";
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);
            set.next();
            int maxID = set.getInt("ID");

            // Query to find the movies for the provided theatre
            query = "SELECT * FROM movies WHERE TheatreID = " + Integer.toString(theatre.getID());
            stmt = dbConnect.createStatement();
            set = stmt.executeQuery(query);
            set.next();

            //Populating the movies in the theatre object
            for(int i = 0; i < maxID; i++){
                int movieID = set.getInt("ID");
                if(movieID - 1 == i){
                    int theatreID = set.getInt("TheatreID");
                    String name = set.getString("Name");
                    DBMovies.add(new Movie(name,theatreID,movieID));
                    set.next();
                }
                else{
                    DBMovies.add(null);
                }
            }

            while (set.next()) {
                int movieID = set.getInt("ID");
                int theatreID = set.getInt("TheatreID");
                String name = set.getString("Name");
                DBMovies.set(movieID - 1, new Movie(name,theatreID,movieID));
            }
            stmt.close();
            set.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        theatre.setMovieList(DBMovies);
        return DBMovies;
    }


    /**
     * Adds a movie into the database
     * 
     * @param movieName Name of the movie to be added
     */
    public void addMovieIntoDB(String movieName) {
        try {

            //Query to add the movie into the database
            String query = "INSERT INTO movies (TheatreID, Name) VALUES (?,?)";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, 1);
            stmt.setString(2, movieName);
            stmt.executeUpdate();

            //Query to find the ID of the movies, for when the showtimes have to be updates
            query = "SELECT * FROM movies WHERE ID = (SELECT MAX(ID) FROM movies)";
            Statement s = dbConnect.createStatement();
            ResultSet res = stmt.executeQuery(query);
            res.next();
            int movieId = res.getInt("ID");

            
            //Query to find the id of the last added showtime, to update the seats
            query = "SELECT * FROM showtimes WHERE ID = (SELECT MAX(ID) FROM showtimes)";
            s = dbConnect.createStatement();
            res = stmt.executeQuery(query);
            res.next();
            int showTimeID = res.getInt("ID");

            //Query for adding showtimes for the added movie
            query = "INSERT INTO showtimes (MovieID, Time) VALUES (?,?)";
            stmt = dbConnect.prepareStatement(query);

            stmt.setInt(1, movieId);
            stmt.setString(2, "12:00");
            stmt.executeUpdate();

            stmt.setInt(1, movieId);
            stmt.setString(2, "15:00");
            stmt.executeUpdate();

            stmt.setInt(1, movieId);
            stmt.setString(2, "18:00");
            stmt.executeUpdate();

            stmt.setInt(1, movieId);
            stmt.setString(2, "20:00");
            stmt.executeUpdate();

            //Query to add seats for the new movie
            query = "INSERT INTO seats (ShowtimeID, Vacancy, RUser) VALUES (?,?,?)";
            stmt = dbConnect.prepareStatement(query);
            showTimeID ++;

            //Iterate through all the showtimes that have been added, and adding 
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 20; j++){
                    stmt.setInt(1, showTimeID);
                    stmt.setBoolean(2, true);
                    stmt.setBoolean(3, false);
                    stmt.executeUpdate();
                }
                showTimeID++;
            }
            stmt.close();
            s.close();
            res.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }

    /**
     * Deletes a movie into the database
     * 
     * @param movieName Name of the movie to be deleted
     */
    public void deleteMovieFromDB(String movie){

        try {
            //Query to find the id of the movie to be deleted
            String query = "SELECT ID FROM movies WHERE Name =" +  "\"" + movie + "\"";
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);

            set.next();
            int movID = set.getInt("ID");
            
            //Query to delete the movie based on its id
            query = "DELETE FROM movies where ID = ?";
            PreparedStatement prepStmt = dbConnect.prepareStatement(query);
            prepStmt.setInt(1, movID);
            prepStmt.executeUpdate();
            
            //Query to find the ids of the showtime based on the movieID
            query = "SELECT ID FROM showtimes WHERE MovieID = " + movID;
            stmt = dbConnect.createStatement();
            set = stmt.executeQuery(query);

            ArrayList<Integer> showtimeIDList = new ArrayList<Integer>();

            while (set.next()) {
                showtimeIDList.add(set.getInt("ID"));
            }
            
            //Delete the showtimes that correspond to the deleted movie
            query = "DELETE FROM showtimes where MovieID = ?";
            prepStmt = dbConnect.prepareStatement(query);
            prepStmt.setInt(1, movID);
            prepStmt.executeUpdate();

            //Delete the seats that correspond to the deleted movie
            for (int i = 0; i < 4; i++){
                query = "DELETE FROM seats where ShowtimeID = ?";
                prepStmt = dbConnect.prepareStatement(query);
                prepStmt.setInt(1, showtimeIDList.get(i));
                prepStmt.executeUpdate();
            }

            stmt.close();
            prepStmt.close();
            set.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /**
     * Determines if the movie is found in the database
     * 
     * @param movieName Name of the movie to be found
     */
    public boolean findMovieInDB(String movieName){

        boolean found = false;

        try {
            //Query to find the movie from the database
            String query = "SELECT Name from movies";
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);
            
            //Set found to true if movie is found
            while(set.next()){
                if(set.getString(1).equals(movieName))
                    found = true;
            }

            stmt.close();
            set.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }

        return found;
    }

}

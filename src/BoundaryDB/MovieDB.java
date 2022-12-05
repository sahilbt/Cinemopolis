package BoundaryDB;


import java.sql.*;
import java.util.*;

import Entitity.*;

public class MovieDB extends Database{
    
 
    public MovieDB(){
        initializeConnection();
    }


    public ArrayList<Movie> getMoviesFromDB(Theatre theatre) {
        ArrayList<Movie> DBMovies = new ArrayList<Movie>();
        try {
            String query = "SELECT * FROM movies WHERE ID = (SELECT MAX(ID) FROM movies)";
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);
            set.next();
            int maxID = set.getInt("ID");


            query = "SELECT * FROM movies WHERE TheatreID = " + Integer.toString(theatre.getID());
            stmt = dbConnect.createStatement();
            set = stmt.executeQuery(query);
            set.next();

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


    public void addMovieIntoDB(String movieName) {
        try {
            String query = "INSERT INTO movies (TheatreID, Name) VALUES (?,?)";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, 1);
            stmt.setString(2, movieName);
            stmt.executeUpdate();

            query = "SELECT * FROM movies WHERE ID = (SELECT MAX(ID) FROM movies)";
            Statement s = dbConnect.createStatement();
            ResultSet res = stmt.executeQuery(query);
            res.next();
            int movieId = res.getInt("ID");

            
            //select * from tbl_name order by id desc limit N;
            query = "SELECT * FROM showtimes WHERE ID = (SELECT MAX(ID) FROM showtimes)";
            s = dbConnect.createStatement();
            res = stmt.executeQuery(query);
            res.next();
            int showTimeID = res.getInt("ID");


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

            query = "INSERT INTO seats (ShowtimeID, Vacancy, RUser) VALUES (?,?,?)";
            stmt = dbConnect.prepareStatement(query);
            showTimeID ++;

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

    public void deleteMovieFromDB(String movie){

        try {
            String query = "SELECT ID FROM movies WHERE Name =" +  "\"" + movie + "\"";
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);

            set.next();
            int movID = set.getInt("ID");
            
            query = "DELETE FROM movies where ID = ?";
            PreparedStatement prepStmt = dbConnect.prepareStatement(query);
            prepStmt.setInt(1, movID);
            prepStmt.executeUpdate();
            

            query = "SELECT ID FROM showtimes WHERE MovieID = " + movID;
            stmt = dbConnect.createStatement();
            set = stmt.executeQuery(query);

            ArrayList<Integer> showtimeIDList = new ArrayList<Integer>();

            while (set.next()) {
                showtimeIDList.add(set.getInt("ID"));
            }

            query = "DELETE FROM showtimes where MovieID = ?";
            prepStmt = dbConnect.prepareStatement(query);
            prepStmt.setInt(1, movID);
            prepStmt.executeUpdate();

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

    //delete maybe
    public String getMovieNameFromDB(int MovieID,int TheatreID,Theatre theatre){
        ArrayList<Movie> MovieList = theatre.getMovieList();
        for(Movie val : MovieList){
            if(MovieID == val.getID()){
                return val.getMovieName();
            }
        }
        return null;
    }


    public boolean findMovieInDB(String movieName){

        boolean found = false;

        try {
            String query = "SELECT Name from movies";
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);
            
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
    
    //maybe delete
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

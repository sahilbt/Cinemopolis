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
        return
        
        DBMovies;
    }


    public void addMovie(String movieName) {
        try {
            String query = "INSERT INTO movies (TheatreID, Name) VALUES (?,?)";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, 1);
            stmt.setString(2, movieName);
            stmt.executeUpdate();

            query = "SELECT * FROM movies WHERE ID = (SELECT MAX(ID) FROM coupons)";
            Statement s = dbConnect.createStatement();
            ResultSet res = stmt.executeQuery(query);
            res.next();
            int movieId = res.getInt("ID");


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

            ArrayList<Integer> showsTimeId = new ArrayList<Integer>();

            //select * from tbl_name order by id desc limit N;
            query = "SELECT * FROM showtimes ORDER BY ID DESC LIMIT 4";
            s = dbConnect.createStatement();
            res = s.executeQuery(query);

            while (res.next()) {
                showsTimeId.add(res.getInt("ID"));
            }

            query = "INSERT INTO seats (ShowtimeID, Vacancy, RUser) VALUES (?,?,?)";
            stmt = dbConnect.prepareStatement(query);

            for(int i = 0; i < showsTimeId.size(); i++){
                for(int j = 0; j < 20; j++){
                    stmt.setInt(1, i);
                    stmt.setBoolean(2, true);
                    stmt.setBoolean(3, false);
                    stmt.executeUpdate();
                }
            }
            stmt.close();
            s.close();
            res.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
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

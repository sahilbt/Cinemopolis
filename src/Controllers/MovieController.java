package Controllers;

import java.util.ArrayList;

import BoundaryDB.MovieDB;
import Entitity.*;


public class MovieController implements Controller{

    private MovieDB db;

    public MovieController(){
       db = new MovieDB();
    }

    public void closeControl(){
        close(db);
    }
    public ArrayList<Movie> getMovies(Theatre theatre ){
        return db.getMoviesFromDB(theatre);
    }

    public void addMovie(String addedMovie){
        db.addMovieIntoDB(addedMovie);
    }

    public void deleteMovie(String deletedMovie){
        db.deleteMovieFromDB(deletedMovie);
    }

    public boolean findMovie(String movie){
        return db.findMovieInDB(movie);
    }
}

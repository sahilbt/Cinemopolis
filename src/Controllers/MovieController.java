package Controllers;

import java.util.ArrayList;

import BoundaryDB.MovieDB;
import Entitity.*;


public class MovieController{

    private MovieDB db;

    public MovieController(){
       db = new MovieDB();
    }
    public ArrayList<Movie> getMoviePageInformation(Theatre theatre ){
        return db.getMoviesFromTheatre(theatre);
    }
}

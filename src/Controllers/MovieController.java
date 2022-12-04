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
    public ArrayList<Movie> getMoviePageInformation(Theatre theatre ){
        return db.getMoviesFromTheatre(theatre);
    }
}

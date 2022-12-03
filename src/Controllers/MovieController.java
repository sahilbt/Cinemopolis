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

    // public String getMovie(int movieID,int theatreID){
    //     return db.getMovieNameFromTheatre(movieID, theatreID);
    // }

    // public boolean forwardMovieSearch(int TheatreID,String MovieName){
    //     return db.checkMovieSearch(TheatreID, MovieName);
    // }



}

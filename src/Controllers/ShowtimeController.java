package Controllers;

import java.util.ArrayList;

import BoundaryDB.ShowtimeDB;
import Entitity.Movie;
import Entitity.Showtime;

public class ShowtimeController{
    
    private ShowtimeDB db;

    public ShowtimeController(){
       db = new ShowtimeDB();
    }

    public ArrayList<Showtime> getShowtimePageInformation(Movie movie){
        return db.getShowtimesFromMovie(movie);
    }

}

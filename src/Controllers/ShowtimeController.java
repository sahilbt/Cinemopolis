package Controllers;

import java.util.ArrayList;

import BoundaryDB.ShowtimeDB;
import Entitity.Movie;
import Entitity.Showtime;

public class ShowtimeController implements Controller{
    
    private ShowtimeDB db;

    public ShowtimeController(){
       db = new ShowtimeDB();
    }

    public void closeControl(){
        close(db);
    }
    
    public ArrayList<Showtime> getShowtimePageInformation(Movie movie){
        return db.getShowtimesFromMovie(movie);
    }

}

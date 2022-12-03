package Controllers;

import java.util.ArrayList;

import BoundaryDB.ShowtimeDB;
import Entitity.Showtime;

public class ShowtimeController{
    
    private ShowtimeDB db;

    public ShowtimeController(){
       db = new ShowtimeDB();
    }

    public ArrayList<Showtime> getShowtimePageInformation(int id){
        return db.getShowtimesFromMovie(id);
    }


}

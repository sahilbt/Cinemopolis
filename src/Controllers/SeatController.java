package Controllers;


import java.util.ArrayList;

import BoundaryDB.*;
import Entitity.*;

public class SeatController implements Controller{
    
    private SeatsDB db;

    public SeatController(){
       db = new SeatsDB();
    }

    public void closeControl(){
        close(db);
    }

    public ArrayList<Seat> getSeats(Showtime s){
        return db.getSeatsFromDB(s);
    }

    public void updateSeats(ArrayList<Integer> seats){
        db.updateSeatsinDB(seats);
    }
    
}

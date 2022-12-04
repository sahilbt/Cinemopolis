package Controllers;


import java.util.ArrayList;

import BoundaryDB.*;
import Entitity.*;

public class SeatController{
    
    private SeatsDB db;

    public SeatController(){
       db = new SeatsDB();
    }

    public ArrayList<Seat> getSeatPageInformation(Showtime s){
        return db.getSeatsFromShowtime(s);
    }

    public void updateSeatinDB(ArrayList<Integer> seats){
        db.bookSeat(seats);
    }
    
}

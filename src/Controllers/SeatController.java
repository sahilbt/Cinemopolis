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

    public ArrayList<Seat> getSeatPageInformation(Showtime s){
        return db.getSeatsFromShowtime(s);
    }

    public void updateSeatinDB(ArrayList<Integer> seats){
        db.bookSeat(seats);
    }
    
}

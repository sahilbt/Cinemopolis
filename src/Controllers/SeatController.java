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

    public boolean forwardRuserCheck(ArrayList<Seat>seats,User u){
        return db.checkRuserSeatLimit(seats,u);
    }

    public boolean bookSeat(ArrayList<Seat>seats,User u){
        return db.checkRuserSeatLimit(seats,u);
    }
}

package Controllers;


import java.util.ArrayList;

import BoundaryDB.*;
import Entitity.*;

public class SeatController implements Controller{
    private SeatsDB db;

    /**
	 * Seat Controller Constructor
	 * 
	*/
    public SeatController(){
       db = new SeatsDB();
    }


    /**
	 * Function to call on the close method to close the SQL connection
	 * 
	 * @param None
	*/
    public void closeControl(){
        close(db);
    }


    /**
	 * Function to get all seats from the databse coressponding to a specific showtime
	 * 
	 * @param s Showtime object for which seats will be retrieved
	*/
    public ArrayList<Seat> getSeats(Showtime s){
        return db.getSeatsFromDB(s);
    }


    /**
	 * Function to update vacancy status for seats that are booked
	 * 
	 * @param seats Array containing seat IDs to be updated
	*/
    public void updateSeats(ArrayList<Integer> seats){
        db.updateSeatsinDB(seats);
    }
}

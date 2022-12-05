package Controllers;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import BoundaryDB.*;
import Entitity.*;

public class TicketController implements Controller{
    TicketDB db;
    Ticket tick;


    /**
	 * Ticket Controller Constructor
	 * 
	 * @param None
	*/
    public TicketController(){
        db = new TicketDB();
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
	 * Function check if a ticket exists in the database
	 * 
	 * @param id Ticket id to be searched
	*/
    public boolean exists(String id){
        return db.ticketExistsInDB(Integer.parseInt(id));
    }


    /**
	 * Function to retrieve a specific ticket from the database
	 * 
	 * @param id Ticket id to be retrieved
	*/
    public Ticket getTicket(String id){
        Ticket tmp = db.getTicketFromDB(Integer.parseInt(id));
        this.tick = tmp;
        return tmp;
    }


    /**
	 * Function to add a ticket to the databse
	 * 
	 * @param ticket ticket object to be added
	*/
    public void addTicketToDB(Ticket ticket){
        db.addTicketToDB(ticket);
    }


    /**
	 * Function to check the validity of particular ticket
	 * 
	 * @param None
	*/
    public boolean notExpired(){
        try{
            String pDate = tick.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
            Date firstDate = sdf.parse(pDate);
            Date secondDate = new Date();

            long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

            if(diff > 3){
                return false;
            }

        } catch(ParseException e){
            e.printStackTrace();
        }
        return true;
    }


    /**
	 * Function to remove a ticket from the database
	 * 
	 * @param t ticket object to be removed
	*/
    public void removeTicket(Ticket t){
        db.removeTicketFromDB(t);
    }


    /**
	 * Function to get the most recently added ticket in the database
	 * 
	 * @param None
	*/
    public int getRecentTicket(){
       return db.getRecentTicketFromDB();
    }
}

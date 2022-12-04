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

    public TicketController(){
        db = new TicketDB();
    }

    public void closeControl(){
        close(db);
    }
    
    public boolean exists(String id){
        return db.exists(Integer.parseInt(id));
    }

    public Ticket getTicket(String id){
        Ticket tmp = db.getTicket(Integer.parseInt(id));
        this.tick = tmp;
        return tmp;
    }

    public void addTicketToDB(Ticket ticket){
        db.addTicketToDB(ticket);
    }

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

    public int getRecentTicket(){
       return db.getRecentTicket();
    }
}

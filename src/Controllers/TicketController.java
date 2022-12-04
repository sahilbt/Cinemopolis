package Controllers;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import BoundaryDB.*;
import Entitity.*;

public class TicketController implements Controller{
    TicketDB t;
    Ticket tick;

    public TicketController(){
        t = new TicketDB();
    }
    
    @Override
    public void interactDatabase() {
        
    }

    public boolean exists(String id){
        return t.exists(Integer.parseInt(id));
    }

    public Ticket getTicket(String id){
        Ticket tmp = t.getTicket(Integer.parseInt(id));
        this.tick = tmp;
        return tmp;
    }

    public void addTicketToDB(Ticket ticket){
        t.addTicketToDB(ticket);
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

}

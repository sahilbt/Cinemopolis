package Entitity;
import java.util.ArrayList;

public class Showtime {
    private ArrayList<Seat> Seats;
    private String Time;

    public Showtime(ArrayList<Seat> Seats,String Time){
        this.Seats = Seats;
        this.Time = Time;
    }

    public ArrayList<Seat> getSeats(){
        return this.Seats;
    }

    public void setSeats(ArrayList<Seat> seats){
        this.Seats = seats;
    }

    public String getTime(){
        return this.Time;
    }

    public void setTime(String Time){
        this.Time = Time;
    }
}

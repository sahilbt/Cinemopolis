package Entitity;
import java.util.ArrayList;

public class Showtime extends Data{
    private ArrayList<Seat> Seats;
    private String Time;
    private int MovieID;

    public Showtime(int ID,int MovieID,String Time){
        super(ID);
        this.Time = Time;
        this.MovieID = MovieID;
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

    public int getMovieID(){
        return this.MovieID;
    }
    public void setMovieID(int id){
        this.MovieID = id;
    }
}

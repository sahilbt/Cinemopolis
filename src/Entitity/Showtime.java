package Entitity;
import java.util.ArrayList;

public class Showtime extends Data{
    private ArrayList<Seat> seats;
    private String time;
    private int movieID;

    /**
	 * Showtime Constructor
	 * 
	 * @param ID showTimeID
     * @param movieID movieID
     * @param time showtime time
	*/ 
    public Showtime(int ID, int movieID, String time){
        super(ID);
        this.time = time;
        this.movieID = movieID;
    }


    /**
	 * Function to get list of all seats
	 * 
	 * @param None
	*/ 
    public ArrayList<Seat> getSeats(){
        return this.seats;
    }


    /**
	 * Function to get list of all seats
	 * 
	 * @param seats new set of seats for the show time
	*/ 
    public void setSeats(ArrayList<Seat> seats){
        this.seats = seats;
    }


    /**
	 * Function to get the show time
	 * 
	 * @param None
	*/ 
    public String getTime(){
        return this.time;
    }


    /**
	 * Function to set the show time
	 * 
	 * @param time new show time
	*/ 
    public void setTime(String time){
        this.time = time;
    }


    /**
	 * Function to get the movie ID
	 * 
	 * @param None
	*/ 
    public int getMovieID(){
        return this.movieID;
    }


    /**
	 * Function to set the movie ID
	 * 
	 * @param id new movie id
	*/ 
    public void setMovieID(int id){
        this.movieID = id;
    }
}

package Entitity;
import java.util.ArrayList;

public class Movie extends Data{
    private String movieName;
    private ArrayList<Showtime> showTimes;
    private int theatreID;


    /**
	 * Movie Constructor
	 * 
	 * @param movieName movie name
     * @param theatreID ID of theatre where the movie is being shown
     * @param movieID ID for movie
	*/       
    public Movie(String movieName, int theatreID, int movieID){
        super(movieID);
        this.movieName = movieName;
        this.theatreID = theatreID;
    }


    /**
	 * Function to get the movie name
	 * 
	 * @param None
	*/   
    public String getMovieName(){
        return this.movieName;
    }


    /**
	 * Function to set the movie name
	 * 
	 * @param movieName movie name to be set
	*/     
    public void setMovieName(String movieName){
        this.movieName = movieName;
    }


    /**
	 * Function to get the theatre ID
	 * 
	 * @param None
	*/     
    public int getTheatreID(){
        return this.theatreID;
    } 


     /**
	 * Function to set the theatre ID
	 * 
	 * @param theatreID theatre ID to be set
	*/     
    public void setTheatreID(int theatreID){
        this.theatreID = theatreID;
    }

    /**
	 * Function to get list of all showtimes corresponding to the movie
	 * 
	 * @param None
	*/  
    public ArrayList<Showtime> getShowTimes(){
        return this.showTimes;
    }


    /**
	 * Function to set list of all showtimes corresponding to the movie
	 * 
	 * @param None
	*/  
    public void setShowTimes(ArrayList<Showtime> showTimes){
        this.showTimes = showTimes;
    }
    
}

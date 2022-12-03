package Entitity;

import java.util.ArrayList;

public class Movie extends Data{
    private String movieName;
    private ArrayList<Showtime> showTimes;
    private int theatreID;

    public Movie(String movieName, int theatreID, int movieID){
        super(movieID);
        this.movieName = movieName;
        this.theatreID = theatreID;
    }

    public String getMovieName(){
        return this.movieName;
    }

    public void setMovieName(String movieName){
        this.movieName = movieName;
    }

    public int getTheatreID(){
        return this.theatreID;
    } 

    public void setTheatreID(int theatreID){
        this.theatreID = theatreID;
    }

    public ArrayList<Showtime> getShowTimes(){
        return this.showTimes;
    }

    public void setShowTimes(ArrayList<Showtime> showTimes){
        this.showTimes = showTimes;
    }
    
}

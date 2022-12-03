package Entitity;

import java.util.ArrayList;

public class Movie extends Data{
    private String MovieName;
    private ArrayList<Showtime> ShowTimes;
    private int TheatreID;

    public Movie(String MovieName,int TheatreID,int MovieID){
        super(MovieID);
        this.MovieName = MovieName;
        this.TheatreID = TheatreID;
    }

    public String getMovieName(){
        return this.MovieName;
    }

    public void setMovieName(String MovieName){
        this.MovieName = MovieName;
    }

    public int getTheatreID(){
        return this.TheatreID;
    } 

    public void setTheatreID(int TheatreID){
        this.TheatreID = TheatreID;
    }

    public ArrayList<Showtime> getShowTimes(){
        return this.ShowTimes;
    }

    public void setShowTimes(ArrayList<Showtime> ShowTimes){
        this.ShowTimes = ShowTimes;
    }
    
}

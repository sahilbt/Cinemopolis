package Entitity;

import java.util.ArrayList;

public class Theatre extends Data{

    private String TheatreName;
    private ArrayList<Movie> Movies;

    public Theatre(String Name, int ID){
      super(ID);
       this.TheatreName = Name;
    }

   public String getTheatreName(){
    return this.TheatreName;
   }

   public void setTheatreName(String Name){
    this.TheatreName = Name;
   }

   public ArrayList<Movie> getMovieList(){
    return this.Movies;
   }

   public void setMovieList(ArrayList<Movie> Movies){
    this.Movies = Movies;
   }
}

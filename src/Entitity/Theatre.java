package Entitity;
import java.util.ArrayList;

public class Theatre extends Data{
    private String theatreName;
    private ArrayList<Movie> movies;


    /**
	 * Theatre constructor
	 * 
	 * @param name name of the theatre
    * @param ID theatre ID
	*/     
   public Theatre(String name, int ID){
      super(ID);
      this.theatreName = name;
   }


   /**
	 * Function to get theatre name
	 * 
	 * @param None
	*/    
   public String getTheatreName(){
      return this.theatreName;
   }


   /**
	 * Function to set theatre name
	 * 
	 * @param name new theatre name
	*/       
   public void setTheatreName(String name){
      this.theatreName = name;
   }


   /**
	 * Function to get the movie list for the theatre
	 * 
	 * @param None
	*/  
   public ArrayList<Movie> getMovieList(){
      return this.movies;
   }


   /**
	 * Function to set the movie list for the theatre
	 * 
	 * @param movies new list of movies to be set for the theatre
	*/  
   public void setMovieList(ArrayList<Movie> movies){
      this.movies = movies;
   }
}

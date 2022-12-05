package Controllers;
import java.util.ArrayList;
import BoundaryDB.MovieDB;
import Entitity.*;


public class MovieController implements Controller{
    private MovieDB db;

    /**
	 * Movie Controller Constructor
	 * 
	 * @param None
	*/    
    public MovieController(){
       db = new MovieDB();
    }

    /**
	 * Function to call on the close method to close the SQL connection
	 * 
	 * @param None
	*/
    public void closeControl(){
        close(db);
    }


    /**
	 * Function to get all movies from the database corresponding to a specific theatre
	 * 
	 * @param Theatre theatre object for which movies will be retrieved
	*/
    public ArrayList<Movie> getMovies(Theatre theatre ){
        return db.getMoviesFromDB(theatre);
    }


    /**
	 * Function to add a movie to the database
	 * 
	 * @param addedMovie name of the movie to be added
	*/
    public void addMovie(String addedMovie){
        db.addMovieIntoDB(addedMovie);
    }


    /**
	 * Function to delete a movie from the database
	 * 
	 * @param deletedMovie name of the movie to be deleted
	*/
    public void deleteMovie(String deletedMovie){
        db.deleteMovieFromDB(deletedMovie);
    }


    /**
	 * Function to find a movie from the database
	 * 
	 * @param movie name of the movie to be searched
	*/
    public boolean findMovie(String movie){
        return db.findMovieInDB(movie);
    }
}

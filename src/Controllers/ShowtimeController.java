package Controllers;

import java.util.ArrayList;
import BoundaryDB.ShowtimeDB;
import Entitity.Movie;
import Entitity.Showtime;

public class ShowtimeController implements Controller{
    private ShowtimeDB db;

    /**
	 * Showtime Controller Constructor
	 * 
	 * @param None
	*/
    public ShowtimeController(){
       db = new ShowtimeDB();
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
	 * Function to get all showtimes from the database corresponding a particular movie
	 * 
	 * @param Movie Movie object for which showtimes will be retrieved
	*/
    public ArrayList<Showtime> getShowtimes(Movie movie){
        return db.getShowtimesFromDB(movie);
    }
}

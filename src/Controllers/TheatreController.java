package Controllers;
import java.util.ArrayList;
import BoundaryDB.TheatreDB;
import Entitity.Theatre;

public class TheatreController implements Controller{
    private TheatreDB db;

    /**
	 * Theatre Controller Constructor
	 * 
	 * @param None
	*/
    public TheatreController(){
       db = new TheatreDB();
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
	 * Function to get all theatres from the database
	 * 
	 * @param None
	*/    
    public ArrayList<Theatre> getTheatres(){
        return db.getTheatresFromDB();
    }
}

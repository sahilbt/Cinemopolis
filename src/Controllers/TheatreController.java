package Controllers;
import java.util.ArrayList;
import BoundaryDB.TheatreDB;
import Entitity.Theatre;

public class TheatreController implements Controller{
    private TheatreDB db;

    public TheatreController(){
       db = new TheatreDB();
    }

    public void closeControl(){
        close(db);
    }

    public ArrayList<Theatre> getTheatreInfo(){
        return db.getAllTheatres();
    }
}

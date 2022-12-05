package BoundaryDB;


import java.sql.*;
import java.util.*;
import Entitity.*;


public class TheatreDB extends Database {

    public TheatreDB(){
        initializeConnection();
    }

    public ArrayList<Theatre> getTheatresFromDB() {
        ArrayList<Theatre> theatres = new ArrayList<Theatre>();
        try {
            String query = "SELECT * FROM theatres";
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);
            while (set.next()) {
                String name = set.getString("Name");
                int ID = set.getInt("ID");
                theatres.add(new Theatre(name, ID));
            }
            stmt.close();
            set.close();
        } catch (SQLException e) {            e.printStackTrace();
        }
        return theatres;

    }
}

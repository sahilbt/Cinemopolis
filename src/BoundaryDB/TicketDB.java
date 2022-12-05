package BoundaryDB;
import Entitity.*;
import java.sql.*;
import java.util.*;
public class TicketDB extends Database {

    /**
     * Constructor for the TicketDB class
     * 
     * @param None
     */
    public TicketDB(){
        initializeConnection();
    }


    /**
     * Checks if a ticket exists in the databaese
     * 
     * @param id Id of the ticket to be checked
     */
    public boolean ticketExistsInDB(int id){
        try {

            //Query to select all the tickets, and then filter it to find it
            String query = "SELECT * FROM tickets";
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);
            while (set.next()) {
                if(set.getInt(1) == id){
                    return true;
                }
            }
            stmt.close();
            set.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    /**
     * Add tickets to the database
     * 
     * @param id t The ticket object that will be added to the database
     */
    public void addTicketToDB(Ticket t){
        try {
            //Query to insert the ticket object into the database
            String query = "INSERT into tickets (RUser, PurchaseDate, Seats, Movie, Theatre, Showtime, Email, Price) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = dbConnect.prepareStatement(query);

            String seatsIntoString = new String();
            for(int number: t.getSeats()){
                seatsIntoString += Integer.toString(number) + " ";
            }

            seatsIntoString.strip();

            //Setting the values for the ticket
            stmt.setBoolean(1, t.getRegistered());
            stmt.setString(2, t.getDate());
            stmt.setString(3, seatsIntoString);
            stmt.setString(4, t.getMovie());
            stmt.setString(5, t.getTheatre());
            stmt.setString(6, t.getShowtime());
            stmt.setString(7, t.getEmail());
            stmt.setInt(8, t.getPrice());

            stmt.executeUpdate();
            stmt.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * Gets a particular ticket from the database that matches that id
     * 
     * @param id The id that corresponds to a ticket in the database
     */
    public Ticket getTicketFromDB(int id){
        Ticket t = new Ticket();
        try {

            //Query to find the ticket based on an id
            String query = "SELECT * FROM tickets WHERE ID = " + Integer.toString(id);
            Statement stmt = dbConnect.createStatement();
            ResultSet res = stmt.executeQuery(query);
            res.next();

            //Splits the string, as the seat ids are stored in a string seperated by whitespace
            String seatsDB = res.getString(4);
            String[] split = seatsDB.split(" ");
            ArrayList<Integer> seatIDs = new ArrayList<Integer>();

            for(String s : split){
                seatIDs.add(Integer.parseInt(s));
            }

            //Creates a ticket object based on the information
            t = new Ticket(res.getInt(1), res.getString(8), res.getString(5), res.getString(7), 
                                  res.getString(3), seatIDs, res.getInt(9), res.getBoolean(2), 
                                  res.getString(6));
        } catch (SQLException e) {
            e.printStackTrace();
        }     
        return t;
    }


    /**
     * Gets the most recent ticket added to the database
     * 
     * @param None
     */
    public int getRecentTicketFromDB(){
        int tmp = 0;
        try {
            //Query to find the largest id from the tickets database 
            String query = "SELECT ID FROM tickets WHERE ID = (SELECT MAX(ID) FROM tickets)";
            Statement stmt = dbConnect.createStatement();
            ResultSet res = stmt.executeQuery(query);
            res.next();
            tmp = res.getInt("ID");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tmp;
    }


    /**
     * Removes a ticket from the database given a ticket object
     * 
     * @param None
     */
    public void removeTicketFromDB(Ticket ticket){
        try{
            //Query to delete the tickets from the databased on a certain id
            String query = "DELETE FROM tickets where ID = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, ticket.getID());
            stmt.executeUpdate();
            stmt.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
}

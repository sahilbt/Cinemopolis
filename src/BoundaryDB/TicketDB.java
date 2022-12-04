package BoundaryDB;
import Entitity.*;
import java.sql.*;
import java.util.*;
public class TicketDB implements Database {
    private Connection dbConnect;    

    public TicketDB(){
        initializeConnection();
    }


    public boolean exists(int id){
        try {
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

    public void addTicketToDB(Ticket t){
        try {
            String query = "INSERT into tickets (RUser, PurchaseDate, Seats, Movie, Theatre, Showtime, Email, Price) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = dbConnect.prepareStatement(query);

            String seatsIntoString = new String();
            for(int number: t.getSeats()){
                seatsIntoString += Integer.toString(number) + " ";
            }

            seatsIntoString.strip();

            stmt.setBoolean(1, t.getRegistered());
            stmt.setString(2, t.getDate());
            stmt.setString(3, seatsIntoString);
            stmt.setString(4, t.getMovie());
            stmt.setString(5, t.getTheatre());
            stmt.setString(6, t.getShowtime());
            stmt.setString(7, t.getEmail());
            stmt.setInt(8, t.getPrice());

            stmt.executeQuery(query);
            stmt.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Ticket getTicket(int id){
        Ticket t = new Ticket();
        try {
            String query = "SELECT * FROM tickets WHERE ID = " + Integer.toString(id);
            Statement stmt = dbConnect.createStatement();
            ResultSet res = stmt.executeQuery(query);
            res.next();

            String seatsDB = res.getString(4);
            String[] split = seatsDB.split(" ");
            ArrayList<Integer> seatIDs = new ArrayList<Integer>();

            for(String s : split){
                seatIDs.add(Integer.parseInt(s));
            }

            t = new Ticket(res.getInt(1), res.getString(8), res.getString(5), res.getString(7), 
                                  res.getString(3), seatIDs, res.getInt(9), res.getBoolean(2), 
                                  res.getString(6));
        } catch (SQLException e) {
            e.printStackTrace();
        }     
        return t;
    }

    public void initializeConnection() {
        try {
            this.dbConnect = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

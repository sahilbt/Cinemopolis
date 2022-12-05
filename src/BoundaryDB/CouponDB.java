package BoundaryDB;

import Entitity.*;
import java.sql.*;
public class CouponDB extends Database {
    
    /**
     * Constructor for the CouponDB class
     * 
     * @param None   
     */
    public CouponDB(){
        initializeConnection();
    }


    /**
     * Adds the coupon into the database when the user cancels a ticket
     * 
     * @param ticket The ticket object that will be cancelled, and generate a coupon    
     */
    public void addCouponIntoDB(Ticket ticket){

        //Gets coupon value based on user
        int value = getCouponValue(ticket.getPrice(), ticket.getRegistered());

        try {
            //Query to add coupon into coupons table
            String query = "INSERT INTO coupons (Value) VALUES (?) ";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, value);
            stmt.executeUpdate();
            stmt.close();

            //Updates seat table to make them available
            for (int s: ticket.getSeats()){
                query = "UPDATE seats SET Vacancy = ? WHERE ID = ?";
                stmt = dbConnect.prepareStatement(query);
                stmt.setBoolean(1, true);
                stmt.setInt(2, s);
                stmt.executeUpdate();
            }

            //Deletes tickets from tickets table
            query = "DELETE FROM tickets where ID = ?";
            stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, ticket.getID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    /**
     * Gets the coupon from the coupon table in the database
     * 
     * @param id The id of the coupon to find 
     */
    public Coupon getCouponFromDB(int id){
        Coupon c = new Coupon(-1,-1);
        try {
            //Query to find all coupons
            String query = "SELECT * FROM coupons";
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);
            
            //Finds coupon with the correct id
            while (set.next()) {
                if(set.getInt("ID") == id){
                    c = new Coupon(id, set.getInt("Value"));
                }
                break;
            }
            stmt.close();
            set.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }


    /**
     * Removes the coupon from the coupon table in the database
     * 
     * @param c Coupon object to be deleted
     */
    public void removeCouponFromDB(Coupon c){
        int id = c.getID();
        try {
            //Query to delete the coupon
            String query = "DELETE FROM coupons where ID = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Updates the coupon in the database after it has been partially redeemed
     * 
     * @param c Coupon object to be updated
     */
    public void updateCouponIntoDB(Coupon c){
        int id = c.getID();
        try {

            //Updating the coupon in the table
            String query = "UPDATE coupons SET Value = ? WHERE ID = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, c.getValue());
            stmt.setInt(2, id);

            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Calculates the value of the coupon depending on the user type
     * 
     * @param price Price of the ticket that was cancelled
     * @param user Boolean indicating if the user is registered
     */
    public int getCouponValue(int price, boolean user){
        double percent = 1;
        
        //Unrgistered users only get 85% of the value of the ticket in their coupon
        if(!user){
            percent = 0.85;
        }

        double discount = price * percent;
        return (int)discount;
    }

    /**
     * Finds the newest coupon that was added to the database
     * 
     * @param None
     */
    public Coupon getRecentCoupon(){
        Coupon c = new Coupon(-1, -1);
        try {
            //Query to get the coupon details from the last row in the coupons table
            String query = "SELECT * FROM coupons WHERE ID = (SELECT MAX(ID) FROM coupons)";
            Statement stmt = dbConnect.createStatement();
            ResultSet res = stmt.executeQuery(query);
            res.next();
            int id = res.getInt("ID");
            int val = res.getInt("Value");
            c = new Coupon(id, val);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    /**
     * Check if coupon exists in the database
     * 
     * @param id Id of the coupon to be checked
     */
    public boolean validateCouponFromDB(int id){
        try {
            //Maybe change this so you look for the ID and if nothing is returned, then return false
            String query = "SELECT * FROM coupons";
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);
            while (set.next()) {
                if(set.getInt("ID") == id){
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
}

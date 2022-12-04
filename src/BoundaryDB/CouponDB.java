package BoundaryDB;

import Entitity.*;
import java.sql.*;
import java.util.*;
public class CouponDB implements Database {
    
    private Connection dbConnect;
    
    public CouponDB(){
        initializeConnection();
    }

    public boolean validateCoupon(int id){
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

    public void addCoupon(Ticket ticket){
        int value = getCouponValue(ticket.getPrice(), ticket.getRegistered());

        try {
            String query = "INSERT INTO coupons (Value) VALUES (?) ";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, value);
            stmt.executeUpdate();
            stmt.close();

            for (int s: ticket.getSeats()){
                query = "UPDATE seats SET Vacancy = ? WHERE ID = ?";
                stmt = dbConnect.prepareStatement(query);
                stmt.setBoolean(1, true);
                stmt.setInt(2, s);
                stmt.executeUpdate();
            }

            query = "DELETE FROM tickets where ID = ?";
            stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, ticket.getID());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Coupon getCouponFromDB(int id){
        Coupon c = new Coupon(-1,-1);
        try {
            String query = "SELECT * FROM coupons";
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);
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

    public void removeCouponFromDB(Coupon c){
        int id = c.getID();
        try {
            String query = "DELETE FROM coupons where ID = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateCouponIntoDB(Coupon c){
        int id = c.getID();
        try {
            String query = "UPDATE coupon SET Value = ? WHERE ID = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setInt(1, c.getValue());
            stmt.setInt(2, id);

            stmt.executeUpdate();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int getCouponValue(int price, boolean user){
        double percent = 1;
        
        if(!user){
            percent = 0.85;
        }

        double discount = price * percent;
        return (int)discount;
    }

    public void initializeConnection() {
        try {
            this.dbConnect = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    

}

package BoundaryDB;

import Entitity.*;
import java.sql.*;
public class CouponDB extends Database {
    
    
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

    public int getCouponValue(int price, boolean user){
        double percent = 1;
        
        if(!user){
            percent = 0.85;
        }

        double discount = price * percent;
        return (int)discount;
    }

    public Coupon getRecentCoupon(){
        Coupon c = new Coupon(-1, -1);
        try {
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
}

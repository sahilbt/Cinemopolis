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
        int value = getCouponValue(ticket.getPrice(), ticket.getRU());

        




        private String email;
        private String movie;
        private String showtime;
        private ArrayList<Seat> seats;
        private int price;
        private boolean registered;




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

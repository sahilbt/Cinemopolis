package BoundaryDB;


import Entitity.*;
import java.sql.*;
import java.util.*;

public class UsersDB extends Database {
    
    private Singleton users;

    public UsersDB(){
        initializeConnection();
        users = Singleton.getInstance();
        if(users.getUsersAdded())
            return;
        else{
            users.setRegisteredUsers(getAllRegisteredUsers());
            users.wasAdded();
        }
    }


    public ArrayList<User> getAllRegisteredUsers(){
        ArrayList<User> DBUser = new ArrayList<>();
        try {
            String query = "SELECT * FROM users";
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);
            while (set.next()) {
                String name = set.getString("Name");
                String address = set.getString("Address");
                String creditNumber = set.getString("CardNum");
                String expdate = set.getString("ExpDate");
                String cvv = set.getString("CVV");
                String cardname = set.getString("CardName");
                String username = set.getString("Email");
                String pswd = set.getString("Password");
                String type = set.getString("UserType");
                PaymentInformation paymentinfo = new PaymentInformation(creditNumber,expdate,cvv,cardname);
                User user = new User(name,address,paymentinfo,username,pswd,type);
                DBUser.add(user);
            }
            stmt.close();
            set.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DBUser;
    }

    public boolean validateLogin(String username, String password){

        for(User val :users.getRegisteredUsers()){
            if (username.equals(val.getUsername()) && password.equals(val.getPassword())) {
                return true;
            }
        } 
        
    return false;
    }

    public User findUser(String username){
        for(User u: users.getRegisteredUsers()){
            if (u.getUsername().equals(username)){
                return u;
            }
        }
        return null;
    }

    public void addRegister(User u){
        try {
            String query = "INSERT INTO users (Email, Password,  Name, CardNum, ExpDate, CVV, CardName, Address, UserType) VALUES (?,?,?,?,?,?,?,?,?) ";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setString(1, u.getUsername());
            stmt.setString(2,u.getPassword());
            stmt.setString(3,u.getName());
            stmt.setString(4,u.getPaymentInformation().getCredit());
            stmt.setString(5,u.getPaymentInformation().getExpDate());
            stmt.setString(6,u.getPaymentInformation().getCVV());
            stmt.setString(7,u.getPaymentInformation().getCardName());
            stmt.setString(8,u.getAddress());
            stmt.setString(9,u.getUserType());
            stmt.executeUpdate();
            stmt.close();
            }catch (SQLException e) {
                e.printStackTrace();
        }
        users.addUser(u);
    }


    public Singleton getSingleton(){
        return users;
    }

    
    public void updateUser(User u){
        try {
            String query = "UPDATE users SET CardNum = ?, ExpDate = ?, CVV = ?, CardName = ? WHERE Email = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setString(1, u.getPaymentInformation().getCredit());
            stmt.setString(2, u.getPaymentInformation().getExpDate());
            stmt.setString(3, u.getPaymentInformation().getCVV());
            stmt.setString(4, u.getPaymentInformation().getCardName());
            stmt.setString(5, u.getUsername());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

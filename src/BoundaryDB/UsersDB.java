package BoundaryDB;


import Entitity.*;
import java.sql.*;
import java.util.*;

public class UsersDB extends Database {
    
    //Singleton of user objects
    private Singleton users;

    
    /**
     * Constructor for the UsersDB class
     * 
     * @param None
     */
    public UsersDB(){
        initializeConnection();

        //Get instance of singleton
        users = Singleton.getInstance();
        if(users.getUsersAdded())
            return;
        else{
            users.setRegisteredUsers(getAllRegisteredUsersFromDB());
            users.wasAdded();
        }
    }


    /**
     * Getting the registered users from the database
     * 
     * @param None
     */
    public ArrayList<User> getAllRegisteredUsersFromDB(){
        ArrayList<User> DBUser = new ArrayList<>();
        try {

            //Query to get all registered users
            String query = "SELECT * FROM users";
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);

            //Create user objects with the nessessary information
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


    /**
     * Checking whether the user had the correct credentials when logging in
     * 
     * @param username Username of the user
     * @param password Password of the user
     */
    public boolean validateLogin(String username, String password){
        //iterate through the singleton and check the values
        for(User val :users.getRegisteredUsers()){
            if (username.equals(val.getUsername()) && password.equals(val.getPassword())) {
                return true;
            }
        } 
        
    return false;
    }


    /**
     * Finding the user in the singleton, and return null if they are not found
     * 
     * @param username Username of the user
     */
    public User findUser(String username){
        //Iterate through singleton to find the user
        for(User u: users.getRegisteredUsers()){
            if (u.getUsername().equals(username)){
                return u;
            }
        }
        return null;
    }


    /**
     * Adding a registered user to the database
     * 
     * @param username u The user object that needs to be added to the database
     */
    public void addRegister(User u){
        try {

            //query to add the user into the database
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


    /**
     * Getting the instance of the singleton containing users
     * 
     * @param None
     */
    public Singleton getSingleton(){
        return users;
    }


    /**
     * Updating the user into the database
     * 
     * @param u The user object that needs to be updated in the database
     */
    public void updateUserInDB(User u){
        try {
            //The query to update the users that is sent into the function
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


    /**
     * Updating the user into the database
     * 
     * @param u The user object that needs to be removed from the database
     */
    public void removeUserFromDB(String email){
        try {
            //The query to delete the users from the database
            String query = "DELETE FROM users WHERE Email = ?";
            PreparedStatement stmt = dbConnect.prepareStatement(query);
            stmt.setString(1, email);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        //remove from the singleton
        users.removeUser(email);
    }
}

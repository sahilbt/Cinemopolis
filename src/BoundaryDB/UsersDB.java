package BoundaryDB;

import Entitity.*;
import java.sql.*;
import java.util.*;

public class UsersDB implements Database {
    
    private Singleton users;
    private Connection dbConnect;

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


        public void initializeConnection() {
            try {
                this.dbConnect = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    

    public ArrayList<User> getAllRegisteredUsers(){
        ArrayList<User> DBUser = new ArrayList<>();
        try {
            String query = "SELECT * FROM user";
            Statement stmt = dbConnect.createStatement();
            ResultSet set = stmt.executeQuery(query);
            while (set.next()) {
                String name = set.getString("Name");
                String address = set.getString("Address");
                String credit = set.getString("Address");
                String username = set.getString("Username");
                String pswd = set.getString("Password");
                String type = set.getString("Type");
                User user = new User(name,address,credit,username,pswd,type);
                DBUser.add(user);
            }
            stmt.close();
            set.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DBUser;
    }

    public boolean validate(String username, String password, String userType){

        for(User val :users.getRegisteredUsers()){
            if (username.equals(val.getUsername()) && password.equals(val.getPassword()) && userType.equals(val.getUserType())) {
                return true;
            }
        } 
        
    return false;
    }

    



}

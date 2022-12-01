package BoundaryDB;

import Entitity.*;
import java.sql.*;
import java.util.*;

public class UsersDB implements Database {
    
    private Singleton users;

    public UsersDB(){
        initializeConnection();
        users = Singleton.getInstance();
        if(users.getUsersAdded())
        return;
        else{
        users.setRegisteredUsers(setLocalUsers());
        users.wasAdded();
        }
        

    }


    public void initializeConnection() {
      //connect to database
    }

    public ArrayList<User> setLocalUsers(){
        ArrayList<User> DBUser = new ArrayList<>();
        //database stuff
        return DBUser;
    }

}

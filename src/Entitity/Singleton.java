package Entitity;

import java.util.*;

public class Singleton{
    private static Singleton instance;

    private ArrayList<User> registeredUsers;

    private boolean UsersAdded = false;


    private Singleton() {
        this.registeredUsers = new ArrayList<User>();

    }

    public ArrayList<User> getRegisteredUsers(){
        return registeredUsers;
    }

    public void setRegisteredUsers(ArrayList<User> registeredUser){
        this.registeredUsers.clear();

        for(User val : registeredUser){
            this.registeredUsers.add(val);
        }
    }

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }


    public void addUser(User u) {
        this.registeredUsers.add(u);
        return;
    }

    public void wasAdded(){
        UsersAdded = true;
    }

    public boolean getUsersAdded(){
        return UsersAdded;
    }

    
}

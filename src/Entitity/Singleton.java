package Entitity;
import java.util.*;

public class Singleton{
    private static Singleton instance;
    private ArrayList<User> registeredUsers;
    private boolean usersAdded = false;

    /**
	 * Singleton Constructor
	 * 
	 * @param None
	*/ 
    private Singleton() {
        this.registeredUsers = new ArrayList<User>();
    }


    /**
	 * Function to get all registered users
	 * 
	 * @param None
	*/ 
    public ArrayList<User> getRegisteredUsers(){
        return registeredUsers;
    }


    /**
	 * Function to set all registered users
	 * 
	 * @param registeredUser new list of users to be set
	*/ 
    public void setRegisteredUsers(ArrayList<User> registeredUser){
        this.registeredUsers.clear();

        for(User val : registeredUser){
            this.registeredUsers.add(val);
        }
    }


    /**
	 * Function to get the only instance of the singleton
	 * 
	 * @param None
	*/ 
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }


    /**
	 * Function to add a user to the singleton
	 * 
	 * @param u User object to be added
	*/ 
    public void addUser(User u) {
        this.registeredUsers.add(u);
        return;
    }


    /**
	 * Function to set the added status
	 * 
	 * @param None
	*/ 
    public void wasAdded(){
        usersAdded = true;
    }


    /**
	 * Function to get the added status
	 * 
	 * @param None
	*/ 
    public boolean getUsersAdded(){
        return usersAdded;
    }

    
    /**
	 * Function to remove a user from the singleton
	 * 
	 * @param email email of user to be removed
	*/ 
    public void removeUser(String email){
        for(int i = 0; i < registeredUsers.size(); i++){
            if(registeredUsers.get(i).getUsername().equals(email)){
                registeredUsers.remove(i);
                break;
            }
        }
    }
  
}

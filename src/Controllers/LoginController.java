package Controllers;
import BoundaryDB.*;
import Entitity.User;

public class LoginController implements Controller{
    private UsersDB db;

    /**
	 * Login Controller Constructor
	 * 
	 * @param None
	*/
    public LoginController(){
        this.db = new UsersDB();
    }


    /**
	 * Function that calls close to close the SQL connection
	 * 
	 * @param None
	*/
    public void closeControl(){
        close(db);
    }


    /**
	 * Function that forwards user credentials to the Users boundry class to validate a user
	 * 
	 * @param user username containing the email address of the user
     * @param pass password of the user
	*/
    public boolean forwardUserCreds(String user, String pass){
        return db.validateLogin(user, pass);
    }


    /**
	 * Function to find a particular user from the singleton
	 * 
	 * @param user username containing the email address of the user
	*/    
    public User findUserFromSingleton(String user){
        return db.findUser(user);
    }


    /**
	 * Function to add a particular user to eh singleton and database
	 * 
	 * @param u User object containing user information to be added
	*/    
    public void addUser(User u){
        db.addRegister(u);
    }


    /**
	 * Function to update user information in the database
	 * 
	 * @param u User object containing user information to be updated
	*/    
    public void updateUser(User u){
        db.updateUserInDB(u);
    }


    /**
	 * Function to remove a particular user from the singleton and databse
	 * 
	 * @param string email id of user to be deleted
	*/    
    public void removeUser(String email){
        db.removeUserFromDB(email);
    }
}

package UI;

import Entitity.User;

public class DashboardScreen {
    private Strategy s;


   /**
	 * DashboardScreen constructor
	 * 
	 * @param user User object used to create the proper dashboard screen based on if the user 
     * is a guest, registered user, or admin
	*/      
    public DashboardScreen(User user){
        if(user == null){
            s = new GuestDashScreen(user);
        }
        else if(user.getUserType().compareTo("R") == 0){
            s = new RegisteredDashScreen(user);
        }
        else if(user.getUserType().compareTo("A") == 0){
            s = new AdminDashScreen(user);
        }
    }

    /**
	 * Function to set the strategy being used
	 * 
	 * @param user User object using the Screen
	*/  
    public void setStrategy(Strategy s){
        this.s = s;
    }


    /**
	 * Function to perform the set strategy
	 * 
	 * @param user User object using the Screen
	*/      
    public void performStrategy(){
        s.initComponents();
    }
}

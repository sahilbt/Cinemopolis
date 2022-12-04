package UI;

import Entitity.User;

public class DashboardScreen {
    private Strategy s;

    public DashboardScreen(User user){
        if(user == null){
            s = new GuestDashScreen(user);
        }
        else if(user.getUserType().compareTo("R") == 0){
            s = new RegisteredDashScreen(user);
        }
    }

    public void setStrategy(Strategy s){
        this.s = s;
    }

    public void performStrategy(){
        s.initComponents();
    }

}

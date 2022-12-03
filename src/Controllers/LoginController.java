package Controllers;
import BoundaryDB.*;
import Entitity.User;

public class LoginController{

    private UsersDB userConnection;

    public LoginController(){
        this.userConnection = new UsersDB();
    }

    public boolean forwardUserCreds(String user, String pass){
        return userConnection.validateLogin(user, pass);
    }

    public User findUserFromSingleton(String user){
        return userConnection.findUser(user);
    }

    public boolean forwardRegistrationValidation(String user){
        return userConnection.validateRegister(user);
    }

    public void forwardRegistrationValidation(User u){
        userConnection.addRegister(u);
    }

}

package Controllers;
import BoundaryDB.*;
import Entitity.User;

public class LoginController implements Controller{

    private UsersDB db;

    public void closeControl(){
        close(db);
    }

    public LoginController(){
        this.db = new UsersDB();
    }

    public boolean forwardUserCreds(String user, String pass){
        return db.validateLogin(user, pass);
    }

    public User findUserFromSingleton(String user){
        return db.findUser(user);
    }

    public void addUser(User u){
        db.addRegister(u);
    }

    public void updateUser(User u){
        db.updateUserInDB(u);
    }

    public void removeUser(String email){
        db.removeUserFromDB(email);
    }

}

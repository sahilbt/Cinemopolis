package Controllers;
import BoundaryDB.*;
import Entitity.Ticket;

public class CouponController implements Controller{

    private CouponDB c;

    public CouponController(){
        c = new CouponDB();
    }


    public void addCoupon(Ticket ticket){
        c.addCoupon(ticket);
    }










    @Override
    public void interactDatabase() {
    }
    
}

package Controllers;
import BoundaryDB.*;
import Entitity.Coupon;
import Entitity.Ticket;

public class CouponController implements Controller{

    private CouponDB c;

    public CouponController(){
        c = new CouponDB();
    }


    public void addCoupon(Ticket ticket){
        c.addCoupon(ticket);
    }

    public boolean sendCouponCreds(String id){
        return c.validateCoupon(Integer.parseInt(id));
    }

    public Coupon getCouponFromBoundaryDB(String id){
        return c.getCouponFromDB(Integer.parseInt(id));
    }

    public void performDeletionOfCoupon(Coupon coup){
        c.removeCouponFromDB(coup);
    }

    public void updateCouponValueInDB(Coupon coup){
        c.updateCouponIntoDB(coup);
    }

    public Coupon getRecentCoupon(){
        return c.getRecentCoupon();
    }




    @Override
    public void interactDatabase() {
    }
    
}

package Controllers;
import BoundaryDB.*;
import Entitity.Coupon;
import Entitity.Ticket;

public class CouponController implements Controller{

    private CouponDB db;

    public CouponController(){
        db = new CouponDB();
    }


    public void addCoupon(Ticket ticket){
        db.addCoupon(ticket);
    }

    public boolean sendCouponCreds(String id){
        return db.validateCoupon(Integer.parseInt(id));
    }

    public Coupon getCouponFromBoundaryDB(String id){
        return db.getCouponFromDB(Integer.parseInt(id));
    }

    public void performDeletionOfCoupon(Coupon coup){
        db.removeCouponFromDB(coup);
    }

    public void updateCouponValueInDB(Coupon coup){
        db.updateCouponIntoDB(coup);
    }

    public Coupon getRecentCoupon(){
        return db.getRecentCoupon();
    }




    
    
}

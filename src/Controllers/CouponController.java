package Controllers;
import BoundaryDB.*;
import Entitity.Coupon;
import Entitity.Ticket;

public class CouponController implements Controller{

    private CouponDB db;

    public CouponController(){
        db = new CouponDB();
    }

    public void closeControl(){
        close(db);
    }
    public void addCoupon(Ticket ticket){
        db.addCouponIntoDB(ticket);
    }

    public boolean validateCoupon(String id){
        return db.validateCouponFromDB(Integer.parseInt(id));
    }

    public Coupon getCoupon(String id){
        return db.getCouponFromDB(Integer.parseInt(id));
    }

    public void deleteCoupon(Coupon coupon){
        db.removeCouponFromDB(coupon);
    }

    public void updateCoupon(Coupon coupon){
        db.updateCouponIntoDB(coupon);
    }

    public Coupon getRecentCoupon(){
        return db.getRecentCoupon();
    }




    
    
}

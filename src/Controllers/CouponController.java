package Controllers;
import BoundaryDB.*;
import Entitity.Coupon;
import Entitity.Ticket;

public class CouponController implements Controller{
    private CouponDB db;

    /**
	 * Coupon Controller Constructor
	 * 
	 * @param None
	*/
    public CouponController(){
        db = new CouponDB();
    }


    /**
	 * Function to call on the close method to close the SQL connection
	 * 
	 * @param None
	*/
    public void closeControl(){
        close(db);
    }


    /**
	 * Fumction to add a coupon based on a canceled ticket
	 * 
	 * @param ticket Ticket Object that is being canceled
	*/
    public void addCoupon(Ticket ticket){
        db.addCouponIntoDB(ticket);
    }


    /**
	 * Function to validate the existence of a coupon
	 * 
	 * @param id Coupon ID
	*/
    public boolean validateCoupon(String id){
        return db.validateCouponFromDB(Integer.parseInt(id));
    }

    /**
	 * Function to delete a coupon from the database after it has been used
	 * 
	 * @param id Coupon ID
	*/
    public void deleteCoupon(Coupon coupon){
        db.removeCouponFromDB(coupon);
    }


    /**
	 * Function to retrieve a particular coupon from the database 
	 * 
	 * @param id Coupon ID
	*/
    public Coupon getCoupon(String id){
        return db.getCouponFromDB(Integer.parseInt(id));
    }


    /**
	 * Function to update a particular coupon
	 * 
	 * @param id Coupon object to be updated
	*/
    public void updateCoupon(Coupon coupon){
        db.updateCouponIntoDB(coupon);
    }


    /**
	 * Function to retrieve the most recent coupon from the database
	 * 
	 * @param None
	*/
    public Coupon getRecentCoupon(){
        return db.getRecentCoupon();
    }
}

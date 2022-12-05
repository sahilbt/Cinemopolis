package Entitity;

public class Coupon extends Data{
    private int value;

    /**
	 * Coupon Constructor
	 * 
	 * @param id Coupon ID
     * @param value Coupon value
	*/
    public Coupon(int id, int value){
        super(id);
        this.value = value;
    }


    /**
	 * Function to get the value of the coupon 
	 * 
	 * @param None
	*/
    public int getValue(){
        return this.value;
    }


    /**
	 * Function to set the value of the coupon 
	 * 
	 * @param None
	*/
    public void setValue(int v){
        this.value = v;
    }
}

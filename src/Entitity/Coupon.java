package Entitity;

public class Coupon extends Data{
    
    private int value;

    public Coupon(int id,int value){
        super(id);
        this.value = value;
    }


    public int getValue(){
        return this.value;
    }

    public void setValue(int v){
        this.value = v;
    }
}

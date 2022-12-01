package Entitity;

public class Seat {
   private boolean vacant;
   private String seatNum;
   
   public Seat(boolean vacant,String seatNum ){
    this.vacant = vacant;
    this.seatNum = seatNum;
   }

   public void setSeatNum(String seatNum){
    this.seatNum = seatNum;
   }

   public String getSeatNum(){
    return seatNum;
   }

   public void setVacant(boolean v){
    this.vacant = v;
   }

   public boolean getVacant(){
    return vacant;
   }


   
}

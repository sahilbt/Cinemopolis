package Entitity;

public class Seat {
   private boolean vacant;
   private String seatNum;
   private String ShowTimeID;

   
   public Seat(boolean vacant,String seatNum, String ShowTimeID){
    this.vacant = vacant;
    this.seatNum = seatNum;
    this.ShowTimeID = ShowTimeID;
   }

   public String getSeatNum(){
      return seatNum;
     }


   public void setSeatNum(String seatNum){
    this.seatNum = seatNum;
   }


   public boolean getVacant(){
      return vacant;
     }

   public void setVacant(boolean v){
    this.vacant = v;
   }


   public String getShowTImeID(){
      return this.ShowTimeID;
     }

   public void setShowTImeID(String ShowTimeID){
      this.ShowTimeID = ShowTimeID;
   }


   
}

package Entitity;

public class Seat extends Data {
   private boolean vacant;
   private int seatID;
   private int ShowTimeID;
   private boolean isRegistered;

   
   public Seat(boolean vacant,int seatNum, int ShowTimeID, boolean isRegistered){
    this.vacant = vacant;
    this.seatID = seatNum;
    this.ShowTimeID = ShowTimeID;
    this.isRegistered = isRegistered;
   }

   public int getSeatID(){
      return seatID;
     }


   public void setSeatID(int seatNum){
    this.seatID = seatNum;
   }


   public boolean getVacant(){
      return vacant;
     }

   public void setVacant(boolean v){
    this.vacant = v;
   }


   public int getShowTImeID(){
      return this.ShowTimeID;
     }

   public void setShowTImeID(int ShowTimeID){
      this.ShowTimeID = ShowTimeID;
   }


   
}

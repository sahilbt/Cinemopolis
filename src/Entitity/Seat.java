package Entitity;

public class Seat extends Data {
   private boolean vacant;
   private int ShowTimeID;
   private boolean isRegistered;

   
   public Seat(boolean vacant,int seatNum, int ShowTimeID, boolean isRegistered){
   super(seatNum);
    this.vacant = vacant;
    this.ShowTimeID = ShowTimeID;
    this.isRegistered = isRegistered;
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


   public boolean getRuser(){
      return this.isRegistered;
     }

   public void setRuser(boolean r){
    this.isRegistered= r;
   }
   
}

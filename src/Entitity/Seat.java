package Entitity;

public class Seat extends Data {
   private boolean vacant;
   private int showTimeID;
   private boolean isRegistered;

   /**
	 * Seat constructor
	 * 
	 * @param vacant vacancy status of the seat
    * @param seatNum seatID for the seat
    * @param showTimeID showtime for which the seat is related
    * @param isRegistered status of whether the seat has been purchased by a registered user
	*/ 
   public Seat(boolean vacant, int seatNum, int showTimeID, boolean isRegistered){
      super(seatNum);
      this.vacant = vacant;
      this.showTimeID = showTimeID;
      this.isRegistered = isRegistered;
   }

   /**
	 * Function to return the vacancy status
	 * 
	 * @param None
	*/ 
   public boolean getVacant(){
      return vacant;
     }


   /**
	 * Function to set the vacancy status
	 * 
	 * @param v new vacancy status
	*/      
   public void setVacant(boolean v){
    this.vacant = v;
   }


   /**
	 * Function to get the showTime ID
	 * 
	 * @param None
	*/   
   public int getShowTimeID(){
      return this.showTimeID;
   }


   /**
	 * Function to set the showTime ID
	 * 
	 * @param showTimeID new showTimeID
	*/ 
   public void setShowTImeID(int showTimeID){
      this.showTimeID = showTimeID;
   }


   /**
	 * Function to get registered user status
	 * 
	 * @param None
	*/ 
   public boolean getRuser(){
      return this.isRegistered;
   }

   /**
	 * Function to set registered user status
	 * 
	 * @param r new status
	*/ 
   public void setRuser(boolean r){
      this.isRegistered= r;
   }
}

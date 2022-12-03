package Entitity;

public class Theatre extends Data{

    private String TheatreName;

    public Theatre(String Name, int ID){
        super(ID);
       this.TheatreName = Name;
    }

   public String getTheatreName(){
    return this.TheatreName;
   }

   public void setTheatreName(String Name){
    this.TheatreName = Name;
   }
}

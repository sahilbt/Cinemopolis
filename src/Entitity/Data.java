package Entitity;

abstract public class Data {
    public int id;


    /**
	 * Data object constructor
	 * 
	 * @param id ID for the particular data object
	*/    
    public Data(int id){
    this.id = id;
    }


    /**
	 * Funtion to get the ID for this data object
	 * 
	 * @param None
	*/    
    public int getID(){
        return this.id;
    }

    /**
	 * Funtion to set the ID for this data object
	 * 
	 * @param None
	*/   
    public void setID(int id){
        this.id = id;
    }
}

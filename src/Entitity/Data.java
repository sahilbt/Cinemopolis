package Entitity;

abstract public class Data {
    public int id;

    public Data(int id){
    this.id = id;
    }

    public int getID(){
        return this.id;
    }

    public void setID(int id){
        this.id = id;
    }
}

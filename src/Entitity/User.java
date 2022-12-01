package Entitity;

public class User {
    
    private String name;
    private String address;
    private String credit;
    private String username;
    private String password;
    private String userType;

    
    public User(String name,String address,String credit,String username,String password,String userType){
        this.name = name;
        this.address = address;
        this.credit = credit;
        this.username = username;
        this.password = password;
        this.userType = userType;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public String getCredit(){
        return this.credit;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public String getUserType(){
        return this.userType;
    }

    
    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setCredit(String credit){
       this.credit = credit;
    }

    public void setUsername(String username){
       this.username = username;
    }

    public void setPassword(String password){
       this.password = password;
    }

    public void setUserType(String usertype){
         this.userType = usertype;
    }


}

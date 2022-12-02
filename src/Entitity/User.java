package Entitity;

public class User extends Data{
    
    private String name;
    private String address;
    private PaymentInformation paymentInformation;
    private String username;
    private String password;
    private String userType;

    public User(String name,String address,PaymentInformation paymentInformation ,String username,String password,String userType){
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.paymentInformation = paymentInformation;
        this.userType = userType;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public PaymentInformation getPaymentInformation(){
        return this.paymentInformation;
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

    public void setPaymentInformation(PaymentInformation paymentInformation){
       this.paymentInformation = paymentInformation;
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

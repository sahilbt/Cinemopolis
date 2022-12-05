package Entitity;

public class User extends Data{
    private String name;
    private String address;
    private PaymentInformation paymentInformation;
    private String username;
    private String password;
    private String userType;

    /**
	 * user constructor
	 * 
	 * @param name name of user
     * @param address address of user
     * @param paymentInformation PaymentInformation object containing users payment information
     * @param username user email
     * @param password user password
     * @param userType type of user "R" for registered, "A" for admin
	*/     
    public User(String name, String address, PaymentInformation paymentInformation, String username, String password, String userType){
        super(-1);
        this.username = username;
        this.password = password;
        this.name = name;
        this.address = address;
        this.paymentInformation = paymentInformation;
        this.userType = userType;
    }


    /**
	 * Function to get user name
	 * 
	 * @param None
	*/        
    public String getName(){
        return this.name;
    }


    /**
	 * Function to get user address
	 * 
	 * @param None
	*/       
    public String getAddress(){
        return this.address;
    }


    /**
	 * Function to get user payment information
	 * 
	 * @param None
	*/     
    public PaymentInformation getPaymentInformation(){
        return this.paymentInformation;
    }


    /**
	 * Function to get user email
	 * 
	 * @param None
	*/     
    public String getUsername(){
        return this.username;
    }


    /**
	 * Function to get user password
	 * 
	 * @param None
	*/     
    public String getPassword(){
        return this.password;
    }


    /**
	 * Function to get user type
	 * 
	 * @param None
	*/     
    public String getUserType(){
        return this.userType;
    }


    
    /**
	 * Function to set user name
	 * 
	 * @param name new name to be set
	*/     
    public void setName(String name){
        this.name = name;
    }


    /**
	 * Function to set user address
	 * 
	 * @param address new address to be set
	*/       
    public void setAddress(String address){
        this.address = address;
    }


    /**
	 * Function to set user payment information
	 * 
	 * @param paymentInformation new paymentInformation object to be set
	*/        
    public void setPaymentInformation(PaymentInformation paymentInformation){
       this.paymentInformation = paymentInformation;
    }


    /**
	 * Function to set user email
	 * 
	 * @param username new email to be set
	*/      
    public void setUsername(String username){
       this.username = username;
    }


    /**
	 * Function to set user password
	 * 
	 * @param password new password to be set
	*/       
    public void setPassword(String password){
       this.password = password;
    }


    /**
	 * Function to set user type
	 * 
	 * @param usertype new user type
	*/     
    public void setUserType(String usertype){
         this.userType = usertype;
    }
}

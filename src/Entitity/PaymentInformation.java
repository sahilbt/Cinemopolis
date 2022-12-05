package Entitity;

public class PaymentInformation{
    String credit;
    String expdate;
    String cvv;
    String cardName;

    /**
	 * PaymentInformation Constructor
	 * 
	 * @param credit credit card number
     * @param expDate expiriry date for the credit card
     * @param cvv cvv for the credit card
     * @param cardName name on credit card
	*/  
    public PaymentInformation(String credit, String expDate, String cvv, String cardName){
        this.credit = credit;
        this.expdate = expDate;
        this.cvv = cvv;
        this.cardName = cardName;
    }


    /**
	 * Function to get the credit card number
	 * 
	 * @param None
	*/  
    public String getCredit(){
        return this.credit;
    }


    /**
	 * Function to set the credit card number
	 * 
	 * @param credit new credit card number
	*/  
    public void setCredit(String credit){
        this.credit = credit;
    }


    /**
	 * Function to get the expiry date
	 * 
	 * @param None
	*/      
    public String getExpDate(){
        return this.expdate;
    }


    /**
	 * Function to set the expiry date
	 * 
	 * @param expDate new expiry date
	*/      
    public void setExpDate(String expDate){
        this.expdate = expDate ;
    }


    /**
	 * Function to get the CVV
	 * 
	 * @param None
	*/      
    public String getCVV(){
        return this.cvv;
    }


    /**
	 * Function to set the CVV
	 * 
	 * @param cvv new CVV
	*/      
    public void setCVV(String cvv){
        this.cvv = cvv;
    }


    /**
	 * Function to get the name on card
	 * 
	 * @param None
	*/      
    public String getCardName(){
        return this.cardName;
    }


    /**
	 * Function to set the name on card
	 * 
	 * @param cardName new name on card
	*/ 
    public void setCardName(String cardName){
        this.cardName = cardName;
    }
}

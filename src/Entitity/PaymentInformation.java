package Entitity;

public class PaymentInformation{
    
    String credit;
    String expdate;
    String cvv;
    String cardName;


    public PaymentInformation(String credit,String ExpDate, String cvv,String cardName){
        this.credit = credit;
        this.expdate = ExpDate;
        this.cvv = cvv;
        this.cardName = cardName;

    }

    public String getCredit(){
        return this.credit;
    }

    public void setCredit(String credit){
        this.credit = credit;
    }

    public String getExpDate(){
        return this.expdate;
    }

    public void setExpDate(String ExpDate){
        this.expdate = ExpDate ;
    }

    public String getCVV(){
        return this.cvv;
    }

    public void setCVV(String cvv){
        this.cvv = cvv;
    }

    public String getCardName(){
        return this.cardName;
    }

    public void setCardName(String cardName){
        this.cardName = cardName;
    }







}

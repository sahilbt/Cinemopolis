package Entitity;

public class PaymentInformation extends Data{
    
    String credit;
    String expdate;
    String cvv;


    public PaymentInformation(String credit,String ExpDate, String cvv){
        this.credit = credit;
        this.expdate = ExpDate;
        this.cvv = cvv;
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







}

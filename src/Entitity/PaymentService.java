package Entitity;

import java.util.ArrayList;
import java.util.Properties;  
import javax.mail.*;  


public class PaymentService {
    
    final String fromEmail = "CinemopolisTheatre@gmail.com"; //requires valid gmail id
    final String password = "xslqzhlzmwhpozvi"; // correct password for gmail id

    public ArrayList<Ticket> tickets;

    public PaymentService(){
        tickets = new ArrayList<>();
    }

    public void makeRegisteredPayment(User u){
        Properties props = new Properties();

		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		props.put("mail.smtp.port", "587"); //TLS Port
		props.put("mail.smtp.auth", "true"); //enable authentication 
    	props.put("mail.smtp.starttls.required", "true");

        Authenticator auth = new Authenticator() {
			//override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
		Session session = Session.getInstance(props, auth);

    }    
   

}


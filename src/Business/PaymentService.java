package Business;

import java.util.ArrayList;
import java.util.Properties;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.security.auth.Subject;

import Entitity.Coupon;
import Entitity.Ticket; 


public class PaymentService{
    
    final String fromEmail = "CinemopolisTheatre@gmail.com"; //requires valid gmail id
    final String password = "xslqzhlzmwhpozvi"; // correct password for gmail id


    public PaymentService(){

    }

    public void makeEmail(Ticket t,Coupon c){
        Properties props = new Properties();

		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		props.put("mail.smtp.port", "587"); //TLS Port
		props.put("mail.smtp.auth", "true"); //enable authentication 
    	props.put("mail.smtp.starttls.required", "true");
        String toEmail = t.getEmail();

        Authenticator auth = new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
		Session session = Session.getInstance(props, auth);
        String subject;
        String body;
        if(c==null){
            subject = makeSubjectEmail(t);
            body = makeBodyEmail(t);
        }
        else{
            subject = makeSubjectEmail(t, c);
            body = makeBodyEmail(t, c);
        }

        EmailUtil.sendEmail(session, toEmail,subject, body,fromEmail);
        

    } 

    public String makeSubjectEmail(Ticket T){
       
            String subject = "Your Cinemopolis Ticket Purchase Confirmation";
            return subject;
    }
       

    public String makeSubjectEmail(Ticket T,Coupon C){
        
            String subject = "Your Cinemopolis Ticket Cancelation Confirmation";
            return subject;
        
    }

    public String makeBodyEmail(Ticket T){
        
        String body = "Thank you for your purchase at Cinemopolis\n\n";
        body+= "Below you will find the information for your tickets\n\n";
        body+= "Movie: " + T.getMovie() + '\n';
        body+= "Theatre: " + T.getTheatre()+ '\n';
        body+= "Date: " + T.getShowtime() + '\n';
        body+= "Quantity: " + T.getSeats().size() + "\n";
        body+= "Seats: ";
        for(int val : T.getSeats()){
            body+=" Seat " + val%20 + ",";
        }
        body = body.substring(0,body.length()-1);
        body+='\n';
        body+= "Price: " + T.getPrice() + '\n';
        body+='\n';
        body+= "We hope to see you again!";
        return body;
    }

    public String makeBodyEmail(Ticket T,Coupon C){
     
        String body = "Your Cinemopolis Ticket Cancelation Confirmation";
        body+= "Below you will find the information for your tickets that you cancelled and your coupon\n\n";
        body+= "Movie: " + T.getMovie() + '\n';
        body+= "Theatre: " + T.getTheatre()+ '\n';
        body+= "Date: " + T.getShowtime() + '\n';
        body+= "Quantity: " + T.getSeats().size() + "\n";
        body+= "Seats: ";
        for(int val : T.getSeats()){
            body+=" Seat " + val + ",";
        }
        body = body.substring(0,body.length()-1);
        body+='\n';
        body+= "Price: " + T.getPrice() + '\n';
        body+='\n';

        body+="Coupon Code: " + C.getID();
        body+="Coupon Value: " + C.getValue(); 
        body+="We hope to see you again!";
        return body;
        }
    }
   

class EmailUtil {

 
    public static void sendEmail(Session session, String toEmail, String subject, String body,String FromEmail){
        try
        {
          MimeMessage msg = new MimeMessage(session);
          //set message headers
          msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
          msg.addHeader("format", "flowed");
          msg.addHeader("Content-Transfer-Encoding", "8bit");
          msg.setFrom(new InternetAddress(FromEmail));
          msg.setReplyTo(InternetAddress.parse(toEmail, false));
          msg.setSubject(subject, "UTF-8");
          msg.setText(body, "UTF-8");
          msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
          Transport.send(msg);

        }
        catch (Exception e) {
          e.printStackTrace();
        }
    }
}


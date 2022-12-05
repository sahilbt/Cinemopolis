package Entitity;
import java.util.ArrayList;

public class Ticket extends Data{
    private String email;
    private String movie;
    private String showtime;
    private ArrayList<Integer> seats;
    private int price;
    private boolean registered;
    private String date;
    private String theatre;


    /**
	 * Ticket Default Constructor
	 * 
	 * @param None
	*/ 
    public Ticket(){
        super(0);
    }


    /**
	 * Ticket Constructor
	 * 
	 * @param ID ID for the ticket
     * @param email email used to purchase ticket
     * @param movie movie for which the ticket was purchased
     * @param showtime showtime for which the ticket was purchased
     * @param date date for which the ticket was purchased
     * @param seats list of all seats booked
     * @param price total price for the booking
     * @param registered whether ticket purchases was registered
     * @param theatre theatre for which the ticket was purchased
	*/     
    public Ticket(int ID, String email, String movie, String showtime, String date, ArrayList<Integer> seats, int price, boolean registered, String theatre){
        super(ID);
        this.email = email;
        this.movie = movie;
        this.showtime = showtime;
        this.seats = seats;
        this.price = price;
        this.registered = registered;
        this.date = date;
        this.theatre = theatre;
    }


    /**
	 * Function to get email
	 * 
	 * @param None 
	*/       
    public String getEmail(){
        return this.email;
    }


    /**
	 * Function to set the email
	 * 
	 * @param email new email 
	*/      
    public void setEmail(String email){
        this.email = email;
    }


    /**
	 * Function to set the email
	 * 
	 * @param None
	*/    
    public String getMovie(){
        return this.movie;
    }


    /**
	 * Function to set the movie name
	 * 
	 * @param movie new movie name
	*/     
    public void setMovie(String movie){
        this.movie = movie;
    }


    /**
	 * Function to get the showtime
	 * 
	 * @param None
	*/        
    public String getShowtime(){
        return this.showtime;
    }


    /**
	 * Function to set the showtime
	 * 
	 * @param showtime new showtime
	*/       
    public void setShowtime(String showtime){
        this.showtime = showtime;
    }


    /**
	 * Function to get the seats list
	 * 
	 * @param None
	*/      
    public ArrayList<Integer> getSeats(){
        return this.seats;
    }


    /**
	 * Function to set the seats list
	 * 
	 * @param seats new seats list
	*/     
    public void setSeats(ArrayList<Integer> seats){
        this.seats = seats;
    }


    /**
	 * Function to get the price
	 * 
	 * @param None
	*/     
    public int getPrice(){
        return this.price;
    }


    /**
	 * Function to set the price
	 * 
	 * @param price new price
	*/        
    public void setPrice(int price){
        this.price = price;
    }


    /**
	 * Function to get the registered status
	 * 
	 * @param None
	*/     
    public boolean getRegistered(){
        return this.registered;
    }


    /**
	 * Function to get the purchase date
	 * 
	 * @param None
	*/  
    public String getDate(){
        return this.date;
    }

  
    /**
	 * Function to get the theatre name
	 * 
	 * @param None
	*/      
    public String getTheatre(){
        return this.theatre;
    }
}

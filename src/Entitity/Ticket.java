package Entitity;

import java.util.ArrayList;

public class Ticket extends Data{
    private String email;
    private String movie;
    private String showtime;
    private ArrayList<Seat> seats;
    private int price;
    private boolean registered;
    private String date;
    private int id;


    public Ticket(String email, String movie, String showtime, String date, ArrayList<Seat> seats, int price, boolean registered, int id){
        this.email = email;
        this.movie = movie;
        this.showtime = showtime;
        this.seats = seats;
        this.price = price;
        this.registered = registered;
        this.date = date;
        this.id = id;
    }


    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getMovie(){
        return this.movie;
    }

    public void setMovie(String movie){
        this.movie = movie;
    }

    public String getShowtime(){
        return this.showtime;
    }

    public void setShowtime(String showtime){
        this.showtime = showtime;
    }

    public ArrayList<Seat> getSeats(){
        return this.seats;
    }

    public void setSeats(ArrayList<Seat> seats){
        this.seats = seats;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public boolean getRegistered(){
        return this.registered;
    }


}

package Entitity;

import java.util.ArrayList;

public class Ticket extends Data{
    private String email;
    private String movie;
    private String showtime;
    private ArrayList<Seat> seats;
    private int price;
    private boolean registered;


    public Ticket(String email, String movie, String showtime, String date, ArrayList<Seat> seats, int price, boolean registered){
        this.email = email;
        this.movie = movie;
        this.showtime = showtime;
        this.seats = seats;
        this.price = price;
        this.registered = registered;
    }


}

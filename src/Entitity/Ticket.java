package Entitity;

public class Ticket extends Data{
    private String email;
    private String movie;
    private Showtime showtime;
    private Seat seat;


    public Ticket(String Email,String movie,Showtime showtime,Seat seat){
        this.email = Email;
        this.movie = movie;
        this.showtime = showtime;
        this.seat = seat;
    }



}

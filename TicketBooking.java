import java.util.*;
class Booking{
      void BookingTicket(){
        System.out.println("Booking a general Ticket-any Mode......");
      }
}
class TrainBooking extends Booking{
    void BookingTicket(){
        System.out.println("Train Ticket Booked Sucessfully......");
        System.out.println("Seat: Lb|Coach: S4|Cost: RS:1000|PNR:122775|Train Name:Vishaka Express");
    }
}
class FlightBooking extends Booking{
    void BookingTicket(){
        System.out.println("Flight ticked booked Sucessfully....");
        System.out.println("Seat: 16A|Service: Indigo|Fare: RS:6000");
    }
}
class CabBooking extends Booking{
    void BookingTicket(){
        System.out.println("sucesssfully Cab Booked.....");
        System.out.println("Vehicle: sedan|Driver: Srinu|Estimated Fare: RS:400");
    }
}
class CruiseBooking extends Booking{
    void BookingTicket(){
        System.out.println("Cruise Sail booked Sucessfully...");
        System.out.println("cabin: FrontView|Deck:3|Cost: 20000");
    }
}
class BusBooking extends Booking{
    void BookingTicket(){
        System.out.println("Bus Ticket Booked Sucessfully.....");
        System.out.println("Seat: 21W|Service: Orange Travels|Number: 2352|Cost: 1100");
    }
}
public class TicketBooking {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Booking book;
        System.out.println("1.Train Booking");
        System.out.println("2.Flight Booking");
        System.out.println("3.Cab Booking");
        System.out.println("4.cruise Booking");
        System.out.println("5. Bus Booking");
        System.out.println("Enter the type/choice of Booking...");
        int choice=sc.nextInt();
        switch(choice){
             case 1:book=new TrainBooking();
                    break;
             case 2:book=new FlightBooking();
                    break;
             case 3:book=new CabBooking();
                    break;
             case 4:book=new CruiseBooking();
                    break;
             case 5:book=new BusBooking();
                    break;
             default:book=new Booking();
        }
        book.BookingTicket();
        sc.close();

    }
    
}

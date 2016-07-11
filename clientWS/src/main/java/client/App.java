package client;


import booking.service.BookingServiceImpl;
import booking.service.BookingServiceImplService;
import booking.service.Person;

import java.net.MalformedURLException;

public class App {
    public static void main(String[] args) throws MalformedURLException {

        BookingServiceImplService bookingService = new BookingServiceImplService();
        BookingServiceImpl bs = bookingService.getBookingServiceImplPort();

        //all tickets
        System.out.println(bs.getAllTickets());

        //book ticket
        Person person = new Person();
        person.setFirstname("testFirstname");
        person.setLastname("testLastname");
        person.setPatronymic("testPatronymic");
        bs.bookedTicket(0, person);
        System.out.println(bs.getAllTickets());

        //buy ticket
        bs.buyTicket(0);
        System.out.println(bs.getAllTickets());

        //return ticket
        bs.removeTicket(0);
        System.out.println(bs.getAllTickets());
    }
}

package client;


import booking.service.impl.BookingError_Exception;
import booking.service.impl.BookingServiceImpl;
import booking.service.impl.BookingServiceImplService;
import booking.service.impl.Person;

import java.net.MalformedURLException;

public class App {
    public static void main(String[] args) throws MalformedURLException, BookingError_Exception {

        BookingServiceImplService bookingService = new BookingServiceImplService();
        BookingServiceImpl bs = bookingService.getBookingServiceImplPort();

        //all tickets
        System.out.println(bs.getAllTickets());

        //book ticket
        Person person = new Person();
        person.setFirstname("testFirstname");
        person.setLastname("testLastname");
        person.setPatronymic("testPatronymic");
        bs.bookedTicket(1, person);
        System.out.println(bs.getAllTickets());

        //buy ticket
        System.out.println(bs.buyTicket(1));

        //return ticket
        System.out.println(bs.returnTicket(1));
    }
}

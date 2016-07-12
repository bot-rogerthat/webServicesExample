package booking.service.impl;

import booking.model.Person;
import booking.model.Ticket;
import booking.model.TicketState;
import booking.service.BookingService;
import booking.service.TicketService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Random;

@WebService()
public class BookingServiceImpl implements BookingService {

    private TicketService ticketService = new TicketServiceImpl();

    @WebMethod
    public Ticket bookTicket(int id, Person person) throws BookingError {
        Ticket ticket = ticketService.getTicketById(id);
        ticket.setPerson(person);
        ticket.setUid(generateId());
        ticket.setState(TicketState.BOOKED);
        return ticket;
    }

    @WebMethod
    public Ticket getTicketById(int id) throws BookingError {
        return ticketService.getTicketById(id);
    }

    @WebMethod
    public Ticket[] getAllTickets() {
        return ticketService.getAllTickets();
    }

    @WebMethod
    public Ticket buyTicket(int id) throws BookingError {
        Ticket ticket = ticketService.getTicketById(id);
        ticket.setState(TicketState.BOUGHT);
        return ticket;
    }

    @WebMethod
    public Ticket returnTicket(int id) throws BookingError {
        return ticketService.returnTicket(id);
    }


    private int generateId() {
        return new Random().nextInt(100);
    }

}

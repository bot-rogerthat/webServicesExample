package booking.service.impl;

import booking.model.Person;
import booking.model.Ticket;
import booking.model.TicketState;
import booking.service.BookingService;
import booking.service.TicketService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Random;

@WebService()
public class BookingServiceImpl implements BookingService {

    private TicketService ticketService = new TicketServiceImpl();

    @WebMethod
    public Ticket bookTicket(@WebParam(name = "id") int id, @WebParam(name = "person") Person person) throws BookingError {
        Ticket ticket = ticketService.getTicketById(id);
        ticket.setPerson(person);
        ticket.setUid(generateId());
        ticket.setState(TicketState.BOOKED);
        return ticket;
    }

    @WebMethod
    public Ticket getTicketById(@WebParam(name = "id") int id) throws BookingError {
        return ticketService.getTicketById(id);
    }

    @WebMethod
    public Ticket[] getAllTickets() {
        return ticketService.getAllTickets();
    }

    @WebMethod
    public Ticket buyTicket(@WebParam(name = "id") int id) throws BookingError {
        Ticket ticket = ticketService.getTicketById(id);
        ticket.setState(TicketState.BOUGHT);
        return ticket;
    }

    @WebMethod
    public Ticket returnTicket(@WebParam(name = "id") int id) throws BookingError {
        return ticketService.returnTicket(id);
    }


    private int generateId() {
        return new Random().nextInt(100);
    }

}

package booking.service;

import booking.model.GroupTickets;
import booking.model.Person;
import booking.model.Ticket;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface BookingService {
    @WebMethod
    public int bookedTicket(int id, Person person);

    @WebMethod
    public Ticket getTicketById(int id);

    @WebMethod
    public GroupTickets getAllTickets();

    @WebMethod
    public void buyTicket(int id);

    @WebMethod
    public void removeTicket(int id);
}

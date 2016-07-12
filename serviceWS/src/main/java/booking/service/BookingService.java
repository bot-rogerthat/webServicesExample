package booking.service;

import booking.model.Person;
import booking.model.Ticket;
import booking.service.impl.BookingError;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface BookingService {
    @WebMethod
    public Ticket bookTicket(int id, Person person) throws BookingError;

    @WebMethod
    public Ticket getTicketById(int id) throws BookingError;

    @WebMethod
    public Ticket[] getAllTickets();

    @WebMethod
    public Ticket buyTicket(int id) throws BookingError;

    @WebMethod
    public Ticket returnTicket(int id) throws BookingError;
}

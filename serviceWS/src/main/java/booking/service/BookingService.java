package booking.service;

import booking.model.Person;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface BookingService {
    @WebMethod
    public int bookedTicket(int id, Person person);

    @WebMethod
    public String getTickets(int id);

    @WebMethod
    public String getAllTickets();

    @WebMethod
    public void payTicket(int id);

    @WebMethod
    public void removeTicket(int id);
}

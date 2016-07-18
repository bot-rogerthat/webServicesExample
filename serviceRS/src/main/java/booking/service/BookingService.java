package booking.service;

import booking.model.Person;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Response;

public interface BookingService {

    @PUT
    Response bookTicket(int id, Person person);

    @GET
    Response getTicketById(int id);

    @GET
    Response getAllTickets();

    @PUT
    Response buyTicket(int id);

    @DELETE
    Response returnTicket(int id);
}

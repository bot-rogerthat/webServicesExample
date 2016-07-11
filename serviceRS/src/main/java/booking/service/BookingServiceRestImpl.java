package booking.service;

import booking.model.Person;
import booking.model.Ticket;
import booking.model.TicketState;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Path("/")
public class BookingServiceRestImpl {

    private static List<Ticket> tickets = new ArrayList<>();

    static {
        Ticket ticket1 = new Ticket();
        ticket1.setId(1);
        ticket1.setArrivalCity("Tver");
        ticket1.setDepartureCity("Moscow");
        ticket1.setArrivalDate(new Date());
        ticket1.setDepartureDate(new Date());
        ticket1.setPrice(new BigDecimal(300));
        ticket1.setState(TicketState.NONE);
        tickets.add(ticket1);

        Ticket ticket2 = new Ticket();
        ticket2.setId(2);
        ticket2.setArrivalCity("Moscow");
        ticket2.setDepartureCity("Tver");
        ticket2.setArrivalDate(new Date());
        ticket2.setDepartureDate(new Date());
        ticket2.setPrice(new BigDecimal(500));
        ticket2.setState(TicketState.NONE);
        tickets.add(ticket2);
    }

    @PUT
    @Produces(MediaType.APPLICATION_XML)
    @Path("/bookTicket/{id}")
    public Response bookedTicket(@PathParam("id") int id, Person person) {
        Ticket ticket = tickets.get(id);
        ticket.setPerson(person);
        ticket.setUid(generateId());
        ticket.setState(TicketState.BOOKED);
        return Response.status(Response.Status.OK).entity(ticket).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/ticket/{id}")
    public Response getTicketById(@PathParam("id") int id) {
        return Response.status(Response.Status.OK).entity(tickets.get(id)).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/tickets")
    public Response getAllTickets() {
        GenericEntity<List<Ticket>> entity = new GenericEntity<List<Ticket>>(tickets) {
        };
        return Response.status(Response.Status.OK).entity(entity).build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_XML)
    @Path("/buy/{id}")
    public Response buyTicket(@PathParam("id") int id) {
        Ticket ticket = tickets.get(id);
        ticket.setState(TicketState.BOUGHT);
        return Response.status(Response.Status.OK).entity(ticket).build();
    }

    @DELETE
    @Produces(MediaType.APPLICATION_XML)
    @Path("/return/{id}")
    public Response removeTicket(@PathParam("id") int id) {
        tickets.remove(id);
        GenericEntity<List<Ticket>> entity = new GenericEntity<List<Ticket>>(tickets) {
        };
        return Response.status(Response.Status.OK).entity(entity).build();

    }

    private static int generateId() {
        return (int) (Math.random() * 100);
    }
}

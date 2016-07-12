package booking.service.impl;

import booking.model.Person;
import booking.model.Ticket;
import booking.model.TicketState;
import booking.service.BookingService;
import booking.service.TicketService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Random;

@Path("/")
public class BookingServiceRestImpl implements BookingService {

    private TicketService ticketService = new TicketServiceImpl();

    @PUT
    @Produces(MediaType.APPLICATION_XML)
    @Path("/bookTicket/{id}")
    public Response bookTicket(@PathParam("id") int id, Person person) {
        Ticket ticket;
        try {
            ticket = ticketService.getTicketById(id);
            ticket.setPerson(person);
            ticket.setUid(generateId());
            ticket.setState(TicketState.BOOKED);
            return Response.status(Response.Status.OK).entity(ticket).build();
        } catch (BookingError bookingError) {
            return Response.status(Response.Status.BAD_REQUEST).entity(bookingError.getMessage()).build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/ticket/{id}")
    public Response getTicketById(@PathParam("id") int id) {
        try {
            return Response.status(Response.Status.OK).entity(ticketService.getTicketById(id)).build();
        } catch (BookingError bookingError) {
            return Response.status(Response.Status.BAD_REQUEST).entity(bookingError.getMessage()).build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/tickets")
    public Response getAllTickets() {
        return Response.status(Response.Status.OK).entity(ticketService.getAllTickets()).build();
    }

    @PUT
    @Produces(MediaType.APPLICATION_XML)
    @Path("/buy/{id}")
    public Response buyTicket(@PathParam("id") int id) {
        Ticket ticket;
        try {
            ticket = ticketService.getTicketById(id);
            ticket.setState(TicketState.BOUGHT);
            return Response.status(Response.Status.OK).entity(ticket).build();
        } catch (BookingError bookingError) {
            return Response.status(Response.Status.BAD_REQUEST).entity(bookingError.getMessage()).build();
        }
    }

    @DELETE
    @Produces(MediaType.APPLICATION_XML)
    @Path("/return/{id}")
    public Response returnTicket(@PathParam("id") int id) {
        try {
            return Response.status(Response.Status.OK).entity(ticketService.returnTicket(id)).build();
        } catch (BookingError bookingError) {
            return Response.status(Response.Status.BAD_REQUEST).entity(bookingError.getMessage()).build();
        }
    }

    private static int generateId() {
        return new Random().nextInt(100);
    }
}

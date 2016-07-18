package clientRS;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.Date;

public class App {
    private static final String GET_TICKETS = "http://localhost:8088/serviceRS-1.0-SNAPSHOT/booking/tickets";
    private static final String GET_TICKET_BY_ID = "http://localhost:8088/serviceRS-1.0-SNAPSHOT/booking/ticket/";
    private static final String BOOK_TICKET_BY_ID = "http://localhost:8088/serviceRS-1.0-SNAPSHOT/booking/bookTicket/";
    private static final String PURCHASE_TICKET_BY_ID = "http://localhost:8088/serviceRS-1.0-SNAPSHOT/booking/buy/";
    private static final String RETURN_TICKET_BY_ID = "http://localhost:8088/serviceRS-1.0-SNAPSHOT/booking/return/";
    private static final String MEDIA_TYPE = "application/xml";
    private static Client client;

    public static void main(String[] args) {

        client = Client.create();

        Person person = new Person();
        person.setFirstname("testFirstname");
        person.setLastname("testLastname");
        person.setPatronymic("testPatronymic");
        person.setBirthday(new Date());

        System.out.println(Arrays.toString(getTickets()));
        System.out.println(getTicketById(1));
        System.out.println(bookTicket(person, 1));
        System.out.println(buyTicket(1));
        System.out.println(returnTicket(1));
    }

    private static Ticket[] getTickets() {
        WebResource webResource = client.resource(GET_TICKETS);
        ClientResponse response = webResource.type(MEDIA_TYPE).get(ClientResponse.class);
        return response.getEntity(Ticket[].class);
    }

    private static Ticket getTicketById(int ticketId) {
        WebResource webResource = client.resource(GET_TICKET_BY_ID + ticketId);
        ClientResponse response = webResource.type(MEDIA_TYPE).get(ClientResponse.class);
        if (response.getStatus() == Response.Status.BAD_REQUEST.getStatusCode()) {
            throw new IllegalArgumentException(response.getEntity(String.class));
        }
        return response.getEntity(Ticket.class);
    }

    private static Ticket bookTicket(Person person, int ticketId) {
        WebResource webResource = client.resource(BOOK_TICKET_BY_ID + ticketId);
        ClientResponse response = webResource.type(MEDIA_TYPE).put(ClientResponse.class, person);
        if (response.getStatus() != Response.Status.OK.getStatusCode()) {
            throw new IllegalArgumentException(response.getEntity(String.class));
        }
        return response.getEntity(Ticket.class);
    }

    private static Ticket buyTicket(int ticketId) {
        WebResource webResource = client.resource(PURCHASE_TICKET_BY_ID + ticketId);
        ClientResponse response = webResource.type(MEDIA_TYPE).put(ClientResponse.class);
        if (response.getStatus() != Response.Status.OK.getStatusCode()) {
            throw new IllegalArgumentException(response.getEntity(String.class));
        }
        return response.getEntity(Ticket.class);
    }

    private static Ticket returnTicket(int ticketId) {
        WebResource webResource = client.resource(RETURN_TICKET_BY_ID + ticketId);
        ClientResponse response = webResource.type(MEDIA_TYPE).delete(ClientResponse.class);
        if (response.getStatus() != Response.Status.OK.getStatusCode()) {
            throw new IllegalArgumentException(response.getEntity(String.class));
        }
        return response.getEntity(Ticket.class);
    }
}

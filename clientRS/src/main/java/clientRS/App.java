package clientRS;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import java.util.Arrays;
import java.util.Date;

public class App {
    private static final String GET_TICKETS = "http://localhost:8088/serviceRS-1.0-SNAPSHOT/booking/tickets";
    private static final String GET_TICKET_BY_ID = "http://localhost:8088/serviceRS-1.0-SNAPSHOT/booking/ticket/";
    private static final String BOOK_TICKET_BY_ID = "http://localhost:8088/serviceRS-1.0-SNAPSHOT/booking/bookTicket/";
    private static final String PURCHASE_TICKET_BY_ID = "http://localhost:8088/serviceRS-1.0-SNAPSHOT/booking/buy/";
    private static final String RETURN_TICKET_BY_ID = "http://localhost:8088/serviceRS-1.0-SNAPSHOT/booking/return/";
    private static final String MEDIA_TYPE = "application/xml";

    public static void main(String[] args) {

        Client client = Client.create();

        Person person = new Person();
        person.setFirstname("testFirstname");
        person.setLastname("testLastname");
        person.setPatronymic("testPatronymic");
        person.setBirthday(new Date());

        System.out.println(Arrays.toString(getTickets(client)));
        System.out.println(getTicketById(client, 0));
        System.out.println(bookTicket(client, person, 0));
        System.out.println(buyTicket(client, 0));
        System.out.println(Arrays.toString(returnTicket(client, 0)));
    }

    private static Ticket[] getTickets(Client client) {
        WebResource webResource = client.resource(GET_TICKETS);
        ClientResponse response = webResource.type(MEDIA_TYPE).get(ClientResponse.class);
        return response.getEntity(Ticket[].class);
    }

    private static Ticket getTicketById(Client client, int ticketId) {
        WebResource webResource = client.resource(GET_TICKET_BY_ID + ticketId);
        ClientResponse response = webResource.type(MEDIA_TYPE).get(ClientResponse.class);
        return response.getEntity(Ticket.class);
    }

    private static Ticket bookTicket(Client client, Person person, int ticketId) {
        WebResource webResource = client.resource(BOOK_TICKET_BY_ID + ticketId);
        ClientResponse response = webResource.type(MEDIA_TYPE).put(ClientResponse.class, person);
        return response.getEntity(Ticket.class);
    }

    private static Ticket buyTicket(Client client, int ticketId) {
        WebResource webResource = client.resource(PURCHASE_TICKET_BY_ID + ticketId);
        ClientResponse response = webResource.type(MEDIA_TYPE).put(ClientResponse.class);
        return response.getEntity(Ticket.class);
    }

    private static Ticket[] returnTicket(Client client, int ticketId) {
        WebResource webResource = client.resource(RETURN_TICKET_BY_ID + ticketId);
        ClientResponse response = webResource.type(MEDIA_TYPE).delete(ClientResponse.class);
        return response.getEntity(Ticket[].class);
    }
}

package booking.service;

import booking.model.GroupTickets;
import booking.model.Person;
import booking.model.Ticket;
import booking.model.TicketState;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService()
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class BookingServiceImpl implements BookingService {

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

    @WebMethod
    public int bookedTicket(int id, Person person) {
        Ticket ticket = tickets.get(id);
        ticket.setPerson(person);
        ticket.setId(generateId());
        ticket.setState(TicketState.BOOKED);
        return ticket.getId();
    }

    @WebMethod
    public Ticket getTicketById(int id) {
        return tickets.get(id);
    }

    @WebMethod
    public GroupTickets getAllTickets() {
        GroupTickets result = new GroupTickets();
        result.setTickets(tickets);
        return result;
    }

    @WebMethod
    public void buyTicket(int id) {
        Ticket ticket = tickets.get(id);
        ticket.setState(TicketState.BOUGHT);
    }

    @WebMethod
    public void removeTicket(int id) {
        tickets.remove(id);
    }


    private int generateId() {
        return (int) (Math.random() * 100);
    }

}

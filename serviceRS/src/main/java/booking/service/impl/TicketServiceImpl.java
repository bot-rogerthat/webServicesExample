package booking.service.impl;

import booking.model.Ticket;
import booking.model.TicketState;
import booking.service.TicketService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TicketServiceImpl implements TicketService {

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

    @Override
    public Ticket getTicketById(int id) throws BookingError {
        for (Ticket elem : tickets) {
            if (elem.getId() == id) {
                return elem;
            }
        }
        throw new BookingError("Ticket not found");
    }

    @Override
    public Ticket[] getAllTickets() {
        return tickets.toArray(new Ticket[tickets.size()]);
    }

    @Override
    public Ticket returnTicket(int id) throws BookingError {
        for (Ticket elem : tickets) {
            if (elem.getId() == id) {
                elem.setState(TicketState.NONE);
                return elem;
            }
        }
        throw new BookingError("Ticket not found");
    }

    @Override
    public void addTicket(Ticket target) {
        tickets.add(target);
    }
}

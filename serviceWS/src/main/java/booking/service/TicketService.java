package booking.service;

import booking.model.Ticket;
import booking.service.impl.BookingError;

public interface TicketService {
    Ticket getTicketById(int id) throws BookingError;

    Ticket[] getAllTickets();

    Ticket returnTicket(int id) throws BookingError;

    void addTicket(Ticket target);
}

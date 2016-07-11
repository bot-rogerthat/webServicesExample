package booking.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "groupTicket")
public class GroupTickets {

    private List<Ticket> tickets;

    @XmlElement
    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "GroupTickets{" +
                "tickets=" + tickets +
                '}';
    }
}

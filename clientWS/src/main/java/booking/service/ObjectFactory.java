package booking.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the booking.service package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GroupTicket_QNAME = new QName("http://service.booking/", "groupTicket");
    private final static QName _Ticket_QNAME = new QName("http://service.booking/", "ticket");
    private final static QName _Person_QNAME = new QName("http://service.booking/", "person");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: booking.service
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Ticket }
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link Person }
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link GroupTickets }
     */
    public GroupTickets createGroupTickets() {
        return new GroupTickets();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupTickets }{@code >}}
     */
    @XmlElementDecl(namespace = "http://service.booking/", name = "groupTicket")
    public JAXBElement<GroupTickets> createGroupTicket(GroupTickets value) {
        return new JAXBElement<GroupTickets>(_GroupTicket_QNAME, GroupTickets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ticket }{@code >}}
     */
    @XmlElementDecl(namespace = "http://service.booking/", name = "ticket")
    public JAXBElement<Ticket> createTicket(Ticket value) {
        return new JAXBElement<Ticket>(_Ticket_QNAME, Ticket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     */
    @XmlElementDecl(namespace = "http://service.booking/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

}

package booking.service.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the booking.service.impl package.
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

    private final static QName _GetAllTicketsResponse_QNAME = new QName("http://impl.service.booking/", "getAllTicketsResponse");
    private final static QName _GetTicketByIdResponse_QNAME = new QName("http://impl.service.booking/", "getTicketByIdResponse");
    private final static QName _Person_QNAME = new QName("http://impl.service.booking/", "person");
    private final static QName _GetTicketById_QNAME = new QName("http://impl.service.booking/", "getTicketById");
    private final static QName _BuyTicketResponse_QNAME = new QName("http://impl.service.booking/", "buyTicketResponse");
    private final static QName _GetAllTickets_QNAME = new QName("http://impl.service.booking/", "getAllTickets");
    private final static QName _ReturnTicket_QNAME = new QName("http://impl.service.booking/", "returnTicket");
    private final static QName _BookingError_QNAME = new QName("http://impl.service.booking/", "BookingError");
    private final static QName _BookedTicket_QNAME = new QName("http://impl.service.booking/", "bookedTicket");
    private final static QName _Ticket_QNAME = new QName("http://impl.service.booking/", "ticket");
    private final static QName _BookedTicketResponse_QNAME = new QName("http://impl.service.booking/", "bookedTicketResponse");
    private final static QName _ReturnTicketResponse_QNAME = new QName("http://impl.service.booking/", "returnTicketResponse");
    private final static QName _BuyTicket_QNAME = new QName("http://impl.service.booking/", "buyTicket");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: booking.service.impl
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnTicketResponse }
     */
    public ReturnTicketResponse createReturnTicketResponse() {
        return new ReturnTicketResponse();
    }

    /**
     * Create an instance of {@link BookedTicket }
     */
    public BookedTicket createBookedTicket() {
        return new BookedTicket();
    }

    /**
     * Create an instance of {@link Ticket }
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link BookedTicketResponse }
     */
    public BookedTicketResponse createBookedTicketResponse() {
        return new BookedTicketResponse();
    }

    /**
     * Create an instance of {@link BuyTicket }
     */
    public BuyTicket createBuyTicket() {
        return new BuyTicket();
    }

    /**
     * Create an instance of {@link GetTicketById }
     */
    public GetTicketById createGetTicketById() {
        return new GetTicketById();
    }

    /**
     * Create an instance of {@link BuyTicketResponse }
     */
    public BuyTicketResponse createBuyTicketResponse() {
        return new BuyTicketResponse();
    }

    /**
     * Create an instance of {@link GetAllTickets }
     */
    public GetAllTickets createGetAllTickets() {
        return new GetAllTickets();
    }

    /**
     * Create an instance of {@link GetAllTicketsResponse }
     */
    public GetAllTicketsResponse createGetAllTicketsResponse() {
        return new GetAllTicketsResponse();
    }

    /**
     * Create an instance of {@link GetTicketByIdResponse }
     */
    public GetTicketByIdResponse createGetTicketByIdResponse() {
        return new GetTicketByIdResponse();
    }

    /**
     * Create an instance of {@link Person }
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link ReturnTicket }
     */
    public ReturnTicket createReturnTicket() {
        return new ReturnTicket();
    }

    /**
     * Create an instance of {@link BookingError }
     */
    public BookingError createBookingError() {
        return new BookingError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTicketsResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.service.booking/", name = "getAllTicketsResponse")
    public JAXBElement<GetAllTicketsResponse> createGetAllTicketsResponse(GetAllTicketsResponse value) {
        return new JAXBElement<GetAllTicketsResponse>(_GetAllTicketsResponse_QNAME, GetAllTicketsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketByIdResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.service.booking/", name = "getTicketByIdResponse")
    public JAXBElement<GetTicketByIdResponse> createGetTicketByIdResponse(GetTicketByIdResponse value) {
        return new JAXBElement<GetTicketByIdResponse>(_GetTicketByIdResponse_QNAME, GetTicketByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.service.booking/", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTicketById }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.service.booking/", name = "getTicketById")
    public JAXBElement<GetTicketById> createGetTicketById(GetTicketById value) {
        return new JAXBElement<GetTicketById>(_GetTicketById_QNAME, GetTicketById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyTicketResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.service.booking/", name = "buyTicketResponse")
    public JAXBElement<BuyTicketResponse> createBuyTicketResponse(BuyTicketResponse value) {
        return new JAXBElement<BuyTicketResponse>(_BuyTicketResponse_QNAME, BuyTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTickets }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.service.booking/", name = "getAllTickets")
    public JAXBElement<GetAllTickets> createGetAllTickets(GetAllTickets value) {
        return new JAXBElement<GetAllTickets>(_GetAllTickets_QNAME, GetAllTickets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnTicket }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.service.booking/", name = "returnTicket")
    public JAXBElement<ReturnTicket> createReturnTicket(ReturnTicket value) {
        return new JAXBElement<ReturnTicket>(_ReturnTicket_QNAME, ReturnTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingError }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.service.booking/", name = "BookingError")
    public JAXBElement<BookingError> createBookingError(BookingError value) {
        return new JAXBElement<BookingError>(_BookingError_QNAME, BookingError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookedTicket }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.service.booking/", name = "bookedTicket")
    public JAXBElement<BookedTicket> createBookedTicket(BookedTicket value) {
        return new JAXBElement<BookedTicket>(_BookedTicket_QNAME, BookedTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ticket }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.service.booking/", name = "ticket")
    public JAXBElement<Ticket> createTicket(Ticket value) {
        return new JAXBElement<Ticket>(_Ticket_QNAME, Ticket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookedTicketResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.service.booking/", name = "bookedTicketResponse")
    public JAXBElement<BookedTicketResponse> createBookedTicketResponse(BookedTicketResponse value) {
        return new JAXBElement<BookedTicketResponse>(_BookedTicketResponse_QNAME, BookedTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnTicketResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.service.booking/", name = "returnTicketResponse")
    public JAXBElement<ReturnTicketResponse> createReturnTicketResponse(ReturnTicketResponse value) {
        return new JAXBElement<ReturnTicketResponse>(_ReturnTicketResponse_QNAME, ReturnTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyTicket }{@code >}}
     */
    @XmlElementDecl(namespace = "http://impl.service.booking/", name = "buyTicket")
    public JAXBElement<BuyTicket> createBuyTicket(BuyTicket value) {
        return new JAXBElement<BuyTicket>(_BuyTicket_QNAME, BuyTicket.class, null, value);
    }

}

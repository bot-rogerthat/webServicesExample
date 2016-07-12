package booking.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebService(name = "BookingServiceImpl", targetNamespace = "http://impl.service.booking/")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface BookingServiceImpl {


    /**
     * @param arg0
     * @return returns booking.service.impl.Ticket
     * @throws BookingError_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTicketById", targetNamespace = "http://impl.service.booking/", className = "booking.service.impl.GetTicketById")
    @ResponseWrapper(localName = "getTicketByIdResponse", targetNamespace = "http://impl.service.booking/", className = "booking.service.impl.GetTicketByIdResponse")
    @Action(input = "http://impl.service.booking/BookingServiceImpl/getTicketByIdRequest", output = "http://impl.service.booking/BookingServiceImpl/getTicketByIdResponse", fault = {
            @FaultAction(className = BookingError_Exception.class, value = "http://impl.service.booking/BookingServiceImpl/getTicketById/Fault/BookingError")
    })
    public Ticket getTicketById(
            @WebParam(name = "arg0", targetNamespace = "")
                    int arg0)
            throws BookingError_Exception
    ;

    /**
     * @param arg1
     * @param arg0
     * @return returns booking.service.impl.Ticket
     * @throws BookingError_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "bookedTicket", targetNamespace = "http://impl.service.booking/", className = "booking.service.impl.BookedTicket")
    @ResponseWrapper(localName = "bookedTicketResponse", targetNamespace = "http://impl.service.booking/", className = "booking.service.impl.BookedTicketResponse")
    @Action(input = "http://impl.service.booking/BookingServiceImpl/bookedTicketRequest", output = "http://impl.service.booking/BookingServiceImpl/bookedTicketResponse", fault = {
            @FaultAction(className = BookingError_Exception.class, value = "http://impl.service.booking/BookingServiceImpl/bookedTicket/Fault/BookingError")
    })
    public Ticket bookedTicket(
            @WebParam(name = "arg0", targetNamespace = "")
                    int arg0,
            @WebParam(name = "arg1", targetNamespace = "")
                    Person arg1)
            throws BookingError_Exception
    ;

    /**
     * @return returns java.util.List<booking.service.impl.Ticket>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllTickets", targetNamespace = "http://impl.service.booking/", className = "booking.service.impl.GetAllTickets")
    @ResponseWrapper(localName = "getAllTicketsResponse", targetNamespace = "http://impl.service.booking/", className = "booking.service.impl.GetAllTicketsResponse")
    @Action(input = "http://impl.service.booking/BookingServiceImpl/getAllTicketsRequest", output = "http://impl.service.booking/BookingServiceImpl/getAllTicketsResponse")
    public List<Ticket> getAllTickets();

    /**
     * @param arg0
     * @return returns booking.service.impl.Ticket
     * @throws BookingError_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buyTicket", targetNamespace = "http://impl.service.booking/", className = "booking.service.impl.BuyTicket")
    @ResponseWrapper(localName = "buyTicketResponse", targetNamespace = "http://impl.service.booking/", className = "booking.service.impl.BuyTicketResponse")
    @Action(input = "http://impl.service.booking/BookingServiceImpl/buyTicketRequest", output = "http://impl.service.booking/BookingServiceImpl/buyTicketResponse", fault = {
            @FaultAction(className = BookingError_Exception.class, value = "http://impl.service.booking/BookingServiceImpl/buyTicket/Fault/BookingError")
    })
    public Ticket buyTicket(
            @WebParam(name = "arg0", targetNamespace = "")
                    int arg0)
            throws BookingError_Exception
    ;

    /**
     * @param arg0
     * @return returns booking.service.impl.Ticket
     * @throws BookingError_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "returnTicket", targetNamespace = "http://impl.service.booking/", className = "booking.service.impl.ReturnTicket")
    @ResponseWrapper(localName = "returnTicketResponse", targetNamespace = "http://impl.service.booking/", className = "booking.service.impl.ReturnTicketResponse")
    @Action(input = "http://impl.service.booking/BookingServiceImpl/returnTicketRequest", output = "http://impl.service.booking/BookingServiceImpl/returnTicketResponse", fault = {
            @FaultAction(className = BookingError_Exception.class, value = "http://impl.service.booking/BookingServiceImpl/returnTicket/Fault/BookingError")
    })
    public Ticket returnTicket(
            @WebParam(name = "arg0", targetNamespace = "")
                    int arg0)
            throws BookingError_Exception
    ;

}

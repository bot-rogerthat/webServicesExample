package booking;

import booking.service.BookingServiceImpl;

import javax.xml.ws.Endpoint;

public class App {
    public static void main(String[] argv) {
        Endpoint.publish("http://localhost:8088/booking", new BookingServiceImpl());
    }
}

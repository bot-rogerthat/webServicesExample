package booking.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ticketState.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ticketState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BOOKED"/>
 *     &lt;enumeration value="BOUGHT"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "ticketState")
@XmlEnum
public enum TicketState {

    BOOKED,
    BOUGHT,
    NONE;

    public String value() {
        return name();
    }

    public static TicketState fromValue(String v) {
        return valueOf(v);
    }

}

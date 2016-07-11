package booking.service;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for person complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="patronymic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", propOrder = {
        "birthday",
        "lastname",
        "patronymic"
})
public class Person {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    protected String lastname;
    protected String patronymic;
    @XmlAttribute(name = "firstname")
    protected String firstname;

    /**
     * Gets the value of the birthday property.
     *
     * @return possible object is
     * {@link XMLGregorianCalendar }
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     *
     * @param value allowed object is
     *              {@link XMLGregorianCalendar }
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the lastname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the patronymic property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPatronymic() {
        return patronymic;
    }

    /**
     * Sets the value of the patronymic property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPatronymic(String value) {
        this.patronymic = value;
    }

    /**
     * Gets the value of the firstname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthday=" + birthday +
                ", lastname='" + lastname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}


package test.salesforce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the test.salesforce package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ContactFirstName_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "FirstName");
    private final static QName _ContactEmail_QNAME = new QName("urn:sobject.enterprise.soap.sforce.com", "Email");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test.salesforce
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotificationsResponse }
     * 
     */
    public NotificationsResponse createNotificationsResponse() {
        return new NotificationsResponse();
    }

    /**
     * Create an instance of {@link Notifications }
     * 
     */
    public Notifications createNotifications() {
        return new Notifications();
    }

    /**
     * Create an instance of {@link ContactNotification }
     * 
     */
    public ContactNotification createContactNotification() {
        return new ContactNotification();
    }

    /**
     * Create an instance of {@link SObject }
     * 
     */
    public SObject createSObject() {
        return new SObject();
    }

    /**
     * Create an instance of {@link AggregateResult }
     * 
     */
    public AggregateResult createAggregateResult() {
        return new AggregateResult();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "FirstName", scope = Contact.class)
    public JAXBElement<String> createContactFirstName(String value) {
        return new JAXBElement<String>(_ContactFirstName_QNAME, String.class, Contact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:sobject.enterprise.soap.sforce.com", name = "Email", scope = Contact.class)
    public JAXBElement<String> createContactEmail(String value) {
        return new JAXBElement<String>(_ContactEmail_QNAME, String.class, Contact.class, value);
    }

}

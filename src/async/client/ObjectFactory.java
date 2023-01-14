
package async.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the async.client package. 
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

    private final static QName _ReserveSupermarket_QNAME = new QName("http://asu.dgtu.donetsk.ua/ex/students", "ReserveSupermarket");
    private final static QName _ReserveSupermarketResponse_QNAME = new QName("http://asu.dgtu.donetsk.ua/ex/students", "ReserveSupermarketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: async.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReserveSupermarketResponse }
     * 
     */
    public ReserveSupermarketResponse createReserveSupermarketResponse() {
        return new ReserveSupermarketResponse();
    }

    /**
     * Create an instance of {@link ReserveSupermarket }
     * 
     */
    public ReserveSupermarket createReserveSupermarket() {
        return new ReserveSupermarket();
    }

    /**
     * Create an instance of {@link Supermarket }
     * 
     */
    public Supermarket createSupermarket() {
        return new Supermarket();
    }

    /**
     * Create an instance of {@link UserReserve }
     * 
     */
    public UserReserve createUserReserve() {
        return new UserReserve();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveSupermarket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asu.dgtu.donetsk.ua/ex/students", name = "ReserveSupermarket")
    public JAXBElement<ReserveSupermarket> createReserveSupermarket(ReserveSupermarket value) {
        return new JAXBElement<ReserveSupermarket>(_ReserveSupermarket_QNAME, ReserveSupermarket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveSupermarketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asu.dgtu.donetsk.ua/ex/students", name = "ReserveSupermarketResponse")
    public JAXBElement<ReserveSupermarketResponse> createReserveSupermarketResponse(ReserveSupermarketResponse value) {
        return new JAXBElement<ReserveSupermarketResponse>(_ReserveSupermarketResponse_QNAME, ReserveSupermarketResponse.class, null, value);
    }

}

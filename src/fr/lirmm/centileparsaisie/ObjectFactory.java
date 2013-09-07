
package fr.lirmm.centileparsaisie;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.lirmm.centileparsaisie package. 
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

    private final static QName _GetCentile_QNAME = new QName("http://centileparsaisie.lirmm.fr/", "getCentile");
    private final static QName _GetCentileResponse_QNAME = new QName("http://centileparsaisie.lirmm.fr/", "getCentileResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.lirmm.centileparsaisie
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCentileResponse }
     * 
     */
    public GetCentileResponse createGetCentileResponse() {
        return new GetCentileResponse();
    }

    /**
     * Create an instance of {@link GetCentile }
     * 
     */
    public GetCentile createGetCentile() {
        return new GetCentile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCentile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://centileparsaisie.lirmm.fr/", name = "getCentile")
    public JAXBElement<GetCentile> createGetCentile(GetCentile value) {
        return new JAXBElement<GetCentile>(_GetCentile_QNAME, GetCentile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCentileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://centileparsaisie.lirmm.fr/", name = "getCentileResponse")
    public JAXBElement<GetCentileResponse> createGetCentileResponse(GetCentileResponse value) {
        return new JAXBElement<GetCentileResponse>(_GetCentileResponse_QNAME, GetCentileResponse.class, null, value);
    }

}

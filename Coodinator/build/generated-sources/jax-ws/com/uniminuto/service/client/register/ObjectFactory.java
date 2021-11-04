
package com.uniminuto.service.client.register;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uniminuto.service.client.register package. 
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

    private final static QName _IRegistrarTransaccion_QNAME = new QName("http://service.uniminuto.com/", "iRegistrarTransaccion");
    private final static QName _IRegistrarTransaccionResponse_QNAME = new QName("http://service.uniminuto.com/", "iRegistrarTransaccionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uniminuto.service.client.register
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IRegistrarTransaccion }
     * 
     */
    public IRegistrarTransaccion createIRegistrarTransaccion() {
        return new IRegistrarTransaccion();
    }

    /**
     * Create an instance of {@link IRegistrarTransaccionResponse }
     * 
     */
    public IRegistrarTransaccionResponse createIRegistrarTransaccionResponse() {
        return new IRegistrarTransaccionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IRegistrarTransaccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.uniminuto.com/", name = "iRegistrarTransaccion")
    public JAXBElement<IRegistrarTransaccion> createIRegistrarTransaccion(IRegistrarTransaccion value) {
        return new JAXBElement<IRegistrarTransaccion>(_IRegistrarTransaccion_QNAME, IRegistrarTransaccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IRegistrarTransaccionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.uniminuto.com/", name = "iRegistrarTransaccionResponse")
    public JAXBElement<IRegistrarTransaccionResponse> createIRegistrarTransaccionResponse(IRegistrarTransaccionResponse value) {
        return new JAXBElement<IRegistrarTransaccionResponse>(_IRegistrarTransaccionResponse_QNAME, IRegistrarTransaccionResponse.class, null, value);
    }

}

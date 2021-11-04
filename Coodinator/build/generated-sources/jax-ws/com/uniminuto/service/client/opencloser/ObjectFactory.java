
package com.uniminuto.service.client.opencloser;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uniminuto.service.client.opencloser package. 
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

    private final static QName _ValidaCreacionBlock_QNAME = new QName("http://service.uniminuto.com/", "validaCreacionBlock");
    private final static QName _ValidaCreacionBlockResponse_QNAME = new QName("http://service.uniminuto.com/", "validaCreacionBlockResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uniminuto.service.client.opencloser
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidaCreacionBlock }
     * 
     */
    public ValidaCreacionBlock createValidaCreacionBlock() {
        return new ValidaCreacionBlock();
    }

    /**
     * Create an instance of {@link ValidaCreacionBlockResponse }
     * 
     */
    public ValidaCreacionBlockResponse createValidaCreacionBlockResponse() {
        return new ValidaCreacionBlockResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaCreacionBlock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.uniminuto.com/", name = "validaCreacionBlock")
    public JAXBElement<ValidaCreacionBlock> createValidaCreacionBlock(ValidaCreacionBlock value) {
        return new JAXBElement<ValidaCreacionBlock>(_ValidaCreacionBlock_QNAME, ValidaCreacionBlock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidaCreacionBlockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.uniminuto.com/", name = "validaCreacionBlockResponse")
    public JAXBElement<ValidaCreacionBlockResponse> createValidaCreacionBlockResponse(ValidaCreacionBlockResponse value) {
        return new JAXBElement<ValidaCreacionBlockResponse>(_ValidaCreacionBlockResponse_QNAME, ValidaCreacionBlockResponse.class, null, value);
    }

}


package com.uniminuto.client.blockchain;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uniminuto.client.blockchain package. 
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

    private final static QName _IConsultarDir_QNAME = new QName("http://service.uniminuto.com/", "iConsultarDir");
    private final static QName _IConsultarDirResponse_QNAME = new QName("http://service.uniminuto.com/", "iConsultarDirResponse");
    private final static QName _ICrearBloque_QNAME = new QName("http://service.uniminuto.com/", "iCrearBloque");
    private final static QName _ICrearBloqueResponse_QNAME = new QName("http://service.uniminuto.com/", "iCrearBloqueResponse");
    private final static QName _IRegistrarData_QNAME = new QName("http://service.uniminuto.com/", "iRegistrarData");
    private final static QName _IRegistrarDataResponse_QNAME = new QName("http://service.uniminuto.com/", "iRegistrarDataResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uniminuto.client.blockchain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IConsultarDir }
     * 
     */
    public IConsultarDir createIConsultarDir() {
        return new IConsultarDir();
    }

    /**
     * Create an instance of {@link IConsultarDirResponse }
     * 
     */
    public IConsultarDirResponse createIConsultarDirResponse() {
        return new IConsultarDirResponse();
    }

    /**
     * Create an instance of {@link ICrearBloque }
     * 
     */
    public ICrearBloque createICrearBloque() {
        return new ICrearBloque();
    }

    /**
     * Create an instance of {@link ICrearBloqueResponse }
     * 
     */
    public ICrearBloqueResponse createICrearBloqueResponse() {
        return new ICrearBloqueResponse();
    }

    /**
     * Create an instance of {@link IRegistrarData }
     * 
     */
    public IRegistrarData createIRegistrarData() {
        return new IRegistrarData();
    }

    /**
     * Create an instance of {@link IRegistrarDataResponse }
     * 
     */
    public IRegistrarDataResponse createIRegistrarDataResponse() {
        return new IRegistrarDataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IConsultarDir }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.uniminuto.com/", name = "iConsultarDir")
    public JAXBElement<IConsultarDir> createIConsultarDir(IConsultarDir value) {
        return new JAXBElement<IConsultarDir>(_IConsultarDir_QNAME, IConsultarDir.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IConsultarDirResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.uniminuto.com/", name = "iConsultarDirResponse")
    public JAXBElement<IConsultarDirResponse> createIConsultarDirResponse(IConsultarDirResponse value) {
        return new JAXBElement<IConsultarDirResponse>(_IConsultarDirResponse_QNAME, IConsultarDirResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ICrearBloque }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.uniminuto.com/", name = "iCrearBloque")
    public JAXBElement<ICrearBloque> createICrearBloque(ICrearBloque value) {
        return new JAXBElement<ICrearBloque>(_ICrearBloque_QNAME, ICrearBloque.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ICrearBloqueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.uniminuto.com/", name = "iCrearBloqueResponse")
    public JAXBElement<ICrearBloqueResponse> createICrearBloqueResponse(ICrearBloqueResponse value) {
        return new JAXBElement<ICrearBloqueResponse>(_ICrearBloqueResponse_QNAME, ICrearBloqueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IRegistrarData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.uniminuto.com/", name = "iRegistrarData")
    public JAXBElement<IRegistrarData> createIRegistrarData(IRegistrarData value) {
        return new JAXBElement<IRegistrarData>(_IRegistrarData_QNAME, IRegistrarData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IRegistrarDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.uniminuto.com/", name = "iRegistrarDataResponse")
    public JAXBElement<IRegistrarDataResponse> createIRegistrarDataResponse(IRegistrarDataResponse value) {
        return new JAXBElement<IRegistrarDataResponse>(_IRegistrarDataResponse_QNAME, IRegistrarDataResponse.class, null, value);
    }

}

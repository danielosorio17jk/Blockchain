
package com.uniminuto.service.client.opencloser;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServiceOpenCloser", targetNamespace = "http://service.uniminuto.com/", wsdlLocation = "http://localhost:10840/OpenCloser/ServiceOpenCloser?wsdl")
public class ServiceOpenCloser_Service
    extends Service
{

    private final static URL SERVICEOPENCLOSER_WSDL_LOCATION;
    private final static WebServiceException SERVICEOPENCLOSER_EXCEPTION;
    private final static QName SERVICEOPENCLOSER_QNAME = new QName("http://service.uniminuto.com/", "ServiceOpenCloser");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:10840/OpenCloser/ServiceOpenCloser?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEOPENCLOSER_WSDL_LOCATION = url;
        SERVICEOPENCLOSER_EXCEPTION = e;
    }

    public ServiceOpenCloser_Service() {
        super(__getWsdlLocation(), SERVICEOPENCLOSER_QNAME);
    }

    public ServiceOpenCloser_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEOPENCLOSER_QNAME, features);
    }

    public ServiceOpenCloser_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICEOPENCLOSER_QNAME);
    }

    public ServiceOpenCloser_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEOPENCLOSER_QNAME, features);
    }

    public ServiceOpenCloser_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceOpenCloser_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceOpenCloser
     */
    @WebEndpoint(name = "ServiceOpenCloserPort")
    public ServiceOpenCloser getServiceOpenCloserPort() {
        return super.getPort(new QName("http://service.uniminuto.com/", "ServiceOpenCloserPort"), ServiceOpenCloser.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceOpenCloser
     */
    @WebEndpoint(name = "ServiceOpenCloserPort")
    public ServiceOpenCloser getServiceOpenCloserPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.uniminuto.com/", "ServiceOpenCloserPort"), ServiceOpenCloser.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEOPENCLOSER_EXCEPTION!= null) {
            throw SERVICEOPENCLOSER_EXCEPTION;
        }
        return SERVICEOPENCLOSER_WSDL_LOCATION;
    }

}

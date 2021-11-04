
package com.uniminuto.service.client.register;

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
@WebServiceClient(name = "ServiceRegister", targetNamespace = "http://service.uniminuto.com/", wsdlLocation = "http://localhost:10840/Register/ServiceRegister?wsdl")
public class ServiceRegister_Service
    extends Service
{

    private final static URL SERVICEREGISTER_WSDL_LOCATION;
    private final static WebServiceException SERVICEREGISTER_EXCEPTION;
    private final static QName SERVICEREGISTER_QNAME = new QName("http://service.uniminuto.com/", "ServiceRegister");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:10840/Register/ServiceRegister?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEREGISTER_WSDL_LOCATION = url;
        SERVICEREGISTER_EXCEPTION = e;
    }

    public ServiceRegister_Service() {
        super(__getWsdlLocation(), SERVICEREGISTER_QNAME);
    }

    public ServiceRegister_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEREGISTER_QNAME, features);
    }

    public ServiceRegister_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICEREGISTER_QNAME);
    }

    public ServiceRegister_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEREGISTER_QNAME, features);
    }

    public ServiceRegister_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceRegister_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServiceRegister
     */
    @WebEndpoint(name = "ServiceRegisterPort")
    public ServiceRegister getServiceRegisterPort() {
        return super.getPort(new QName("http://service.uniminuto.com/", "ServiceRegisterPort"), ServiceRegister.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServiceRegister
     */
    @WebEndpoint(name = "ServiceRegisterPort")
    public ServiceRegister getServiceRegisterPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.uniminuto.com/", "ServiceRegisterPort"), ServiceRegister.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEREGISTER_EXCEPTION!= null) {
            throw SERVICEREGISTER_EXCEPTION;
        }
        return SERVICEREGISTER_WSDL_LOCATION;
    }

}


package com.uniminuto.service.client.opencloser;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceOpenCloser", targetNamespace = "http://service.uniminuto.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceOpenCloser {


    /**
     * 
     * @param valida
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validaCreacionBlock", targetNamespace = "http://service.uniminuto.com/", className = "com.uniminuto.service.client.opencloser.ValidaCreacionBlock")
    @ResponseWrapper(localName = "validaCreacionBlockResponse", targetNamespace = "http://service.uniminuto.com/", className = "com.uniminuto.service.client.opencloser.ValidaCreacionBlockResponse")
    @Action(input = "http://service.uniminuto.com/ServiceOpenCloser/validaCreacionBlockRequest", output = "http://service.uniminuto.com/ServiceOpenCloser/validaCreacionBlockResponse")
    public boolean validaCreacionBlock(
        @WebParam(name = "valida", targetNamespace = "")
        boolean valida);

}

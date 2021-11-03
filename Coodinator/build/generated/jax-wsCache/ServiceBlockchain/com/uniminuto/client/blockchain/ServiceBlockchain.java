
package com.uniminuto.client.blockchain;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiceBlockchain", targetNamespace = "http://service.uniminuto.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiceBlockchain {


    /**
     * 
     * @param emisor
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "iConsultarDir", targetNamespace = "http://service.uniminuto.com/", className = "com.uniminuto.client.blockchain.IConsultarDir")
    @ResponseWrapper(localName = "iConsultarDirResponse", targetNamespace = "http://service.uniminuto.com/", className = "com.uniminuto.client.blockchain.IConsultarDirResponse")
    @Action(input = "http://service.uniminuto.com/ServiceBlockchain/iConsultarDirRequest", output = "http://service.uniminuto.com/ServiceBlockchain/iConsultarDirResponse")
    public int iConsultarDir(
        @WebParam(name = "emisor", targetNamespace = "")
        String emisor);

    /**
     * 
     * @param fecha
     * @param receptor
     * @param valor
     * @param emisor
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "iRegistrarData", targetNamespace = "http://service.uniminuto.com/", className = "com.uniminuto.client.blockchain.IRegistrarData")
    @ResponseWrapper(localName = "iRegistrarDataResponse", targetNamespace = "http://service.uniminuto.com/", className = "com.uniminuto.client.blockchain.IRegistrarDataResponse")
    @Action(input = "http://service.uniminuto.com/ServiceBlockchain/iRegistrarDataRequest", output = "http://service.uniminuto.com/ServiceBlockchain/iRegistrarDataResponse")
    public boolean iRegistrarData(
        @WebParam(name = "emisor", targetNamespace = "")
        String emisor,
        @WebParam(name = "receptor", targetNamespace = "")
        String receptor,
        @WebParam(name = "valor", targetNamespace = "")
        int valor,
        @WebParam(name = "fecha", targetNamespace = "")
        XMLGregorianCalendar fecha);

    /**
     * 
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "iCrearBloque", targetNamespace = "http://service.uniminuto.com/", className = "com.uniminuto.client.blockchain.ICrearBloque")
    @ResponseWrapper(localName = "iCrearBloqueResponse", targetNamespace = "http://service.uniminuto.com/", className = "com.uniminuto.client.blockchain.ICrearBloqueResponse")
    @Action(input = "http://service.uniminuto.com/ServiceBlockchain/iCrearBloqueRequest", output = "http://service.uniminuto.com/ServiceBlockchain/iCrearBloqueResponse")
    public boolean iCrearBloque();

}

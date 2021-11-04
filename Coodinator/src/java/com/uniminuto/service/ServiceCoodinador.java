/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.service;

import com.uniminuto.interna.ConsumoClienteBlockchain;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author daniel.osorio
 */
@WebService(serviceName = "ServiceCoodinador")
public class ServiceCoodinador {
    ConsumoClienteBlockchain ConsumoClienteBlockchain = new ConsumoClienteBlockchain();

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "iConsultarFondos")
    public int hello(@WebParam(name = "emisor") String txt) {
        
        return ConsumoClienteBlockchain.consultar(txt);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "iRegistrarTransaccion")
    public boolean iRegistrarData(@WebParam(name = "emisor") String emisor, @WebParam(name = "receptor") String receptor, @WebParam(name = "valor") int valor, @WebParam(name = "fecha") XMLGregorianCalendar fecha) {
        //TODO write your implementation code here:
        return ConsumoClienteBlockchain.registrar(emisor, receptor, valor, fecha);
    }

}

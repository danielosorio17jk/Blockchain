/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.service;


import com.uniminuto.register.ValidaRegister;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author daniel.osorio
 */
@WebService(serviceName = "ServiceRegister")
public class ServiceRegister {
    ValidaRegister ValidaRegister = new ValidaRegister();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "iRegistrarTransaccion")
    public boolean iRegistrarTransaccion(@WebParam(name = "emisor") String emisor, @WebParam(name = "receptor") String receptor, @WebParam(name = "valor") int valor, @WebParam(name = "fecha") XMLGregorianCalendar fecha) {
        return ValidaRegister.validaRegistro(emisor, receptor, valor, fecha);
    }
}

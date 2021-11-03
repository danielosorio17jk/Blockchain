/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.service;

import com.uniminuto.blockchain.Main;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author daniel.osorio
 */
@WebService(serviceName = "ServiceBlockchain")
public class ServiceBlockchain {
    Main main =  new Main();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "iConsultarDir")
    public int hello(@WebParam(name = "emisor") String txt) {
        
        return main.consultaSaldo(txt);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "iRegistrarData")
    public boolean iRegistrarData(@WebParam(name = "emisor") String emisor, @WebParam(name = "receptor") String receptor, @WebParam(name = "valor") int valor, @WebParam(name = "fecha") Date fecha) {
        //TODO write your implementation code here:
        return main.validaTransacciones(emisor, receptor, valor, fecha);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "iCrearBloque")
    public boolean iCrearBloque() {
        //TODO write your implementation code here:
        return main.crearBloque();
    }
    
    
}

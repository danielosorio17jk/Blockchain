/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.service;

import com.uniminuto.opencloser.CreacionBlock;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author daniel.osorio
 */
@WebService(serviceName = "ServiceOpenCloser")
public class ServiceOpenCloser {
    CreacionBlock cb = new CreacionBlock();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "validaCreacionBlock")
    public boolean creacionBlock(@WebParam(name = "valida") boolean txt) {
        return cb.validaCreacionBloack(txt);
    }
}

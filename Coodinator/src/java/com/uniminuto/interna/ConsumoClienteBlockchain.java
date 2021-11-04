/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.interna;

import com.uniminuto.service.client.blockchain.ServiceBlockchain_Service;
import com.uniminuto.service.client.opencloser.ServiceOpenCloser_Service;
import com.uniminuto.service.client.register.ServiceRegister_Service;
import com.uniminuto.service.client.blockchain.ServiceBlockchain;
import com.uniminuto.service.client.opencloser.ServiceOpenCloser;
import com.uniminuto.service.client.register.ServiceRegister;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author daniel.osorio
 */
public class ConsumoClienteBlockchain {

    ServiceBlockchain_Service blockchain_Service = new ServiceBlockchain_Service();
    ServiceBlockchain serviceBlockchain;

    ServiceRegister_Service serviceRegister_Service = new ServiceRegister_Service();
    ServiceRegister serviceRegister;
    
    ServiceOpenCloser_Service serviceOpenCloser_Service = new ServiceOpenCloser_Service();
    ServiceOpenCloser serviceOpenCloser;

    public ConsumoClienteBlockchain() {
        serviceBlockchain = blockchain_Service.getServiceBlockchainPort();
        serviceRegister = serviceRegister_Service.getServiceRegisterPort();
        serviceOpenCloser = serviceOpenCloser_Service.getServiceOpenCloserPort();
    }

    public int consultar(String emisor) {
        return serviceBlockchain.iConsultarDir(emisor);
    }

    public boolean registrar(String emisor, String receptor, int valor, XMLGregorianCalendar fecha) {
        //Al registar se debe validar con register 
        if (serviceRegister.iRegistrarTransaccion(emisor, receptor, valor, fecha)) {
            if (serviceBlockchain.iRegistrarData(emisor, receptor, valor, fecha)) {
                //registra bien y se procede a crea bloque
                crearBloque(true);
                // se debe validar con OpenCloser 
                return true;
            } else {
                crearBloque(false);
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean crearBloque(boolean valida) {
        if (serviceOpenCloser.validaCreacionBlock(valida)) {
            return serviceBlockchain.iCrearBloque();
        }else{
            return false;
        }
    }

}

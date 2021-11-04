/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.register;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author daniel.osorio
 */
public class ValidaRegister {

    int contador = 0;

    public boolean validaRegistro(String emisor, String receptor, int valor, XMLGregorianCalendar fecha) {
        if (contador > 3) {
            if (emisor.isEmpty() || receptor.isEmpty() || valor == 0) {
                return true;
            }
        } else {
             if (emisor.isEmpty() ||  valor == 0) {
                return true;
            }
            contador++;

        }
        return false;

    }

}

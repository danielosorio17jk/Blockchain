/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.register;

import java.util.Date;

/**
 *
 * @author daniel.osorio
 */
public class ValidaRegister {

    int contador = 0;

    public boolean validaRegistro(String emisor, String receptor, int valor, Date fecha) {
        if (contador > 3) {
            if (emisor.isEmpty() || receptor.isEmpty() || valor == 0) {
                return false;
            }
        } else {
             if (emisor.isEmpty() ||  valor == 0) {
                return false;
            }
            contador++;

        }
        return true;

    }

}

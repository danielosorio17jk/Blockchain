
package com.uniminuto.service.client.opencloser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validaCreacionBlock complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validaCreacionBlock"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valida" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validaCreacionBlock", propOrder = {
    "valida"
})
public class ValidaCreacionBlock {

    protected boolean valida;

    /**
     * Obtiene el valor de la propiedad valida.
     * 
     */
    public boolean isValida() {
        return valida;
    }

    /**
     * Define el valor de la propiedad valida.
     * 
     */
    public void setValida(boolean value) {
        this.valida = value;
    }

}

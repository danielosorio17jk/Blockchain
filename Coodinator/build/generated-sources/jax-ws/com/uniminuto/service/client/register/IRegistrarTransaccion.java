
package com.uniminuto.service.client.register;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para iRegistrarTransaccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="iRegistrarTransaccion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="emisor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receptor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iRegistrarTransaccion", propOrder = {
    "emisor",
    "receptor",
    "valor",
    "fecha"
})
public class IRegistrarTransaccion {

    protected String emisor;
    protected String receptor;
    protected int valor;
    @XmlSchemaType(name = "anySimpleType")
    protected Object fecha;

    /**
     * Obtiene el valor de la propiedad emisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmisor() {
        return emisor;
    }

    /**
     * Define el valor de la propiedad emisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmisor(String value) {
        this.emisor = value;
    }

    /**
     * Obtiene el valor de la propiedad receptor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceptor() {
        return receptor;
    }

    /**
     * Define el valor de la propiedad receptor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceptor(String value) {
        this.receptor = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     */
    public int getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     */
    public void setValor(int value) {
        this.valor = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFecha(Object value) {
        this.fecha = value;
    }

}

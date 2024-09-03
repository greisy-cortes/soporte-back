
package WSDL;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para facturaTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="facturaTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idRegFactura" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noEspo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rfc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sociedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facturaTO", propOrder = {
    "fecha",
    "idFactura",
    "idRegFactura",
    "importe",
    "iva",
    "noDoc",
    "noEspo",
    "rfc",
    "sociedad",
    "tipoDoc"
})
public class FacturaTO {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected String idFactura;
    protected int idRegFactura;
    protected String importe;
    protected String iva;
    protected String noDoc;
    protected String noEspo;
    protected String rfc;
    protected String sociedad;
    protected String tipoDoc;

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad idFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFactura() {
        return idFactura;
    }

    /**
     * Define el valor de la propiedad idFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFactura(String value) {
        this.idFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad idRegFactura.
     * 
     */
    public int getIdRegFactura() {
        return idRegFactura;
    }

    /**
     * Define el valor de la propiedad idRegFactura.
     * 
     */
    public void setIdRegFactura(int value) {
        this.idRegFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporte(String value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad iva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIva() {
        return iva;
    }

    /**
     * Define el valor de la propiedad iva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIva(String value) {
        this.iva = value;
    }

    /**
     * Obtiene el valor de la propiedad noDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoDoc() {
        return noDoc;
    }

    /**
     * Define el valor de la propiedad noDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoDoc(String value) {
        this.noDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad noEspo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoEspo() {
        return noEspo;
    }

    /**
     * Define el valor de la propiedad noEspo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoEspo(String value) {
        this.noEspo = value;
    }

    /**
     * Obtiene el valor de la propiedad rfc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Define el valor de la propiedad rfc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfc(String value) {
        this.rfc = value;
    }

    /**
     * Obtiene el valor de la propiedad sociedad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSociedad() {
        return sociedad;
    }

    /**
     * Define el valor de la propiedad sociedad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSociedad(String value) {
        this.sociedad = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDoc() {
        return tipoDoc;
    }

    /**
     * Define el valor de la propiedad tipoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDoc(String value) {
        this.tipoDoc = value;
    }

}

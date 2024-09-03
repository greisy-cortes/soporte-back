
package WSDL;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaFacturaTO complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaFacturaTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facturaTOs" type="{http://webservices.ddas.gis.sss.dfa.telcel.com/}facturaTO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="idError" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="msgError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaFacturaTO", propOrder = {
    "facturaTOs",
    "idError",
    "msgError"
})
public class ConsultaFacturaTO {

    @XmlElement(nillable = true)
    protected List<FacturaTO> facturaTOs;
    protected int idError;
    protected String msgError;

    /**
     * Gets the value of the facturaTOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the facturaTOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacturaTOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacturaTO }
     * 
     * 
     */
    public List<FacturaTO> getFacturaTOs() {
        if (facturaTOs == null) {
            facturaTOs = new ArrayList<FacturaTO>();
        }
        return this.facturaTOs;
    }

    /**
     * Obtiene el valor de la propiedad idError.
     * 
     */
    public int getIdError() {
        return idError;
    }

    /**
     * Define el valor de la propiedad idError.
     * 
     */
    public void setIdError(int value) {
        this.idError = value;
    }

    /**
     * Obtiene el valor de la propiedad msgError.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgError() {
        return msgError;
    }

    /**
     * Define el valor de la propiedad msgError.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgError(String value) {
        this.msgError = value;
    }

}

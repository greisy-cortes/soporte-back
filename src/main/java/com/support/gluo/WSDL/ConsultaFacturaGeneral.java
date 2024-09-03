
package WSDL;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para consultaFacturaGeneral complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="consultaFacturaGeneral"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datosConsulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaFacturaGeneral", propOrder = {
    "datosConsulta"
})
public class ConsultaFacturaGeneral {

    protected String datosConsulta;

    /**
     * Obtiene el valor de la propiedad datosConsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosConsulta() {
        return datosConsulta;
    }

    /**
     * Define el valor de la propiedad datosConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosConsulta(String value) {
        this.datosConsulta = value;
    }

}

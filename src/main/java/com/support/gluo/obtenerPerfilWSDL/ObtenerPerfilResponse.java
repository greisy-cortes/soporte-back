
package obtenerPerfilWSDL;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="obtenerPerfilReturn" type="{http://entidades.datos.perfiladormt.dsie.gsa.sds.di.telcel.com.mx}Perfil"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "obtenerPerfilReturn"
})
@XmlRootElement(name = "obtenerPerfilResponse")
public class ObtenerPerfilResponse {

    @XmlElement(required = true)
    protected Perfil obtenerPerfilReturn;

    /**
     * Obtiene el valor de la propiedad obtenerPerfilReturn.
     * 
     * @return
     *     possible object is
     *     {@link Perfil }
     *     
     */
    public Perfil getObtenerPerfilReturn() {
        return obtenerPerfilReturn;
    }

    /**
     * Define el valor de la propiedad obtenerPerfilReturn.
     * 
     * @param value
     *     allowed object is
     *     {@link Perfil }
     *     
     */
    public void setObtenerPerfilReturn(Perfil value) {
        this.obtenerPerfilReturn = value;
    }

}

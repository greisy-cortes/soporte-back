
package obtenerPerfilWSDL;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the obtenerPerfilWSDL package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: obtenerPerfilWSDL
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidAcceso }
     * 
     */
    public ValidAcceso createValidAcceso() {
        return new ValidAcceso();
    }

    /**
     * Create an instance of {@link ValidAccesoResponse }
     * 
     */
    public ValidAccesoResponse createValidAccesoResponse() {
        return new ValidAccesoResponse();
    }

    /**
     * Create an instance of {@link ObtenerPerfil }
     * 
     */
    public ObtenerPerfil createObtenerPerfil() {
        return new ObtenerPerfil();
    }

    /**
     * Create an instance of {@link ObtenerPerfilResponse }
     * 
     */
    public ObtenerPerfilResponse createObtenerPerfilResponse() {
        return new ObtenerPerfilResponse();
    }

    /**
     * Create an instance of {@link Perfil }
     * 
     */
    public Perfil createPerfil() {
        return new Perfil();
    }

}

package com.support.gluo.business;

import com.support.gluo.obtenerPerfilWSDL.ObtenerPerfil;
import com.support.gluo.obtenerPerfilWSDL.ObtenerPerfilResponse;
import jakarta.xml.bind.JAXBElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapFaultException;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class Perfilador extends WebServiceGatewaySupport {
    private static final Logger logger = LoggerFactory.getLogger(Perfilador.class);

    public ObtenerPerfilResponse obtenerPerfil(String telefono) {

        try {
            ObtenerPerfil request = new ObtenerPerfil();
            request.setTelefono(telefono);
            request.setOrigen("0");
            request.setAccion("0");

            logger.debug("Sending request: {}", request);

            SoapActionCallback soapActionCallback = new SoapActionCallback("http://negocio.perfiladormt.dsie.gsa.sds.di.telcel.com.mx/obtenerPerfil");
            ObtenerPerfilResponse response = (ObtenerPerfilResponse) getWebServiceTemplate().marshalSendAndReceive("http://clientesw.telcel.com/PerfiladorMTV2/services/PerfiladorMT", request, soapActionCallback);
            //ObtenerPerfilResponse response = (ObtenerPerfilResponse)getWebServiceTemplate().marshalSendAndReceive("http://clientesw.telcel.com/PerfiladorMTV2/services/PerfiladorMT", request, soapActionCallback);
            logger.debug("Received response: {}", response); // Y aquí también
            return response;
        } catch (
                SoapFaultException e) {
            // Maneja el error SOAP
            logger.error("SOAP Fault: {} - {}", e.getStackTrace(), e.getMessage());

        } catch (Exception e) {
            // Maneja otros errores
            logger.error("Exception occurred: {}", e.getMessage());
        }
        return null;
    }


}

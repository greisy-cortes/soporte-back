package com.support.gluo.business;

import com.support.gluo.obtenerPerfilWSDL.ObtenerPerfil;
import com.support.gluo.obtenerPerfilWSDL.ObtenerPerfilResponse;
import jakarta.xml.bind.JAXBElement;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class Perfilador extends WebServiceGatewaySupport {

    public ObtenerPerfilResponse obtenerPerfil(String telefono, String origen, String accion){


        ObtenerPerfil request = new ObtenerPerfil();
        request.setTelefono(telefono);
        request.setOrigen(origen);
        request.setAccion(accion);
        SoapActionCallback soapActionCallback = new SoapActionCallback("http://negocio.perfiladormt.dsie.gsa.sds.di.telcel.com.mx/obtenerPerfil");
        JAXBElement<ObtenerPerfilResponse> response = (JAXBElement<ObtenerPerfilResponse>)getWebServiceTemplate().marshalSendAndReceive("http://clientesw.telcel.com/PerfiladorMTV2/services/PerfiladorMT", request, soapActionCallback);
        //obtenerPerfilWSDL.ObtenerPerfilResponse response = (obtenerPerfilWSDL.ObtenerPerfilResponse)getWebServiceTemplate().marshalSendAndReceive("http://clientesw.telcel.com/PerfiladorMTV2/services/PerfiladorMT", request, soapActionCallback);

        return response.getValue();
    }



}

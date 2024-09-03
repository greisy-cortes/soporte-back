package com.support.gluo.business;

import WSDL.ConsultaFacturaPDFXML;
import WSDL.ConsultaFacturaPDFXMLResponse;
import jakarta.xml.bind.JAXBElement;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class ConsultaFactura extends WebServiceGatewaySupport {

    public ConsultaFacturaPDFXMLResponse getFacturaResponse(String user, String password) {

        ConsultaFacturaPDFXML request = new ConsultaFacturaPDFXML();

        request.setUsuario(user);
        request.setPassword(password);

        SoapActionCallback callback = new SoapActionCallback("http://webservices.ddas.gis.sss.dfa.telcel.com/");

        JAXBElement<ConsultaFacturaPDFXMLResponse> response = (JAXBElement<ConsultaFacturaPDFXMLResponse>)
                getWebServiceTemplate().marshalSendAndReceive(
                        "http://sap.intranet.telcelinstitucional.com:80/WSFactConsignacionWEB/ConsultaFacturasWSService",
                        request,
                        callback
                );

        return response.getValue();
    }
}
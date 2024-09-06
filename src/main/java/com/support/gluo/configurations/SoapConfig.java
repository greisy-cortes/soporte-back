package com.support.gluo.configurations;

import com.support.gluo.business.ConsultaFactura;
import com.support.gluo.business.Perfilador;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {
@Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("WSDL");

        return marshaller;
    }

@Bean
    public ConsultaFactura getSoapClient(Jaxb2Marshaller marshaller){
        ConsultaFactura facturaBusiness = new ConsultaFactura();
        facturaBusiness.setDefaultUri("http://sap.intranet.telcelinstitucional.com:80/WSFactConsignacionWEB/ConsultaFacturasWSService");
        facturaBusiness.setMarshaller(marshaller);
        facturaBusiness.setUnmarshaller(marshaller);

        return facturaBusiness;
    }

@Bean
    public Perfilador obtenerPerfilSoap(Jaxb2Marshaller marshaller){
        Perfilador perfil = new Perfilador();
        perfil.setDefaultUri("http://clientesw.telcel.com/PerfiladorMTV2/services/PerfiladorMT");
        perfil.setMarshaller(marshaller);
        perfil.setUnmarshaller(marshaller);

        return  perfil;
    }
}

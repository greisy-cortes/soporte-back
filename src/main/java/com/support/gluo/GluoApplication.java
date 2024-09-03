package com.support.gluo;

import com.support.gluo.business.ConsultaFactura;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import WSDL.ConsultaFacturaPDFXMLResponse;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GluoApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(GluoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(GluoApplication.class, args);
	}

	@Bean
	CommandLineRunner init(ConsultaFactura consultaFactura){
		return args -> {

			ConsultaFacturaPDFXMLResponse response = consultaFactura.getFacturaResponse("STC_TELCELCO", "T3LC3L");

			LOGGER.info("Se consumio el servicio: {}", response.getReturn());
		};
	}

}

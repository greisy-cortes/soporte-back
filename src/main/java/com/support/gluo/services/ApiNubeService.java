package com.support.gluo.services;

import com.support.gluo.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiNubeService {

    RestClient restClient = RestClient.create("http://api-nube.telcel.com/telcel-api-web/api/roaming");

    private final RestTemplate restTemplate;
    public ApiNubeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public List<ResponseDTO> consultarServiciosApiNube(){

        List<ResponseDTO> responses = new ArrayList<>();

        responses.add(newService("/paquetesTarifasTerrestre/2/2", "Roaming Terrestre"));
        responses.add(newService("/paquetesTarifasMaritima/2/2", "Roaming Maritima"));
        responses.add(newService("/paquetesTarifasAerea/2/2", "Roaming Aerea"));
        responses.add(newService("/paisesConPaquetesyTarifas/9", "Países con paquetes y tarifas"));
        responses.add(newService("/lineasConPaquetesyTarifas/3/2", "Navieras y Aerolíneas"));
        responses.add(newService("/trasporteConPaquetesyTarifas/1/2", "Barcos y Aviones"));

        return responses;
    }

    public ResponseDTO newService(String uri, String serviceName){
        try {
            ResponseEntity<String> servicioTerrestre = restClient.get()
                    .uri(uri)
                    .retrieve()
                    .toEntity(String.class);
            return (new ResponseDTO(serviceName, servicioTerrestre.getStatusCode().value(), servicioTerrestre.getBody()));
        } catch (HttpClientErrorException e){
            return (new ResponseDTO(serviceName, e.getStatusCode().value(), e.getMessage()));
        }
    }
}

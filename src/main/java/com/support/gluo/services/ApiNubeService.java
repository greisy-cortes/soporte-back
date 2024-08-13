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

    private final RestTemplate restTemplate;
    public ApiNubeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public List<ResponseDTO> consultarServiciosApiNube(String clientUrl){
        RestClient restClient = RestClient.create(clientUrl);
        List<ResponseDTO> responses = new ArrayList<>();

        responses.add(newService(restClient, "/paquetesTarifasTerrestre/2/2", "Roaming Terrestre"));
        responses.add(newService(restClient, "/paquetesTarifasMaritima/2/2", "Roaming Maritima"));
        responses.add(newService(restClient, "/paquetesTarifasAerea/2/2", "Roaming Aerea"));
        responses.add(newService(restClient, "/paisesConPaquetesyTarifas/9", "Países con paquetes y tarifas"));
        responses.add(newService(restClient, "/lineasConPaquetesyTarifas/3/2", "Navieras y Aerolíneas"));
        responses.add(newService(restClient, "/trasporteConPaquetesyTarifas/1/2", "Barcos y Aviones"));

        return responses;
    }

    public ResponseDTO newService(RestClient client, String uri, String serviceName){
        try {
            ResponseEntity<String> servicioTerrestre = client.get()
                    .uri(uri)
                    .retrieve()
                    .toEntity(String.class);
            return (new ResponseDTO(serviceName, servicioTerrestre.getStatusCode().value(), servicioTerrestre.getBody()));
        } catch (HttpClientErrorException e){
            return (new ResponseDTO(serviceName, e.getStatusCode().value(), e.getMessage()));
        }
    }
}

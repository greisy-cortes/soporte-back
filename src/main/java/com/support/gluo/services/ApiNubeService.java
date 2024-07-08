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

        responses.add(servicioTerrestre());
        responses.add(servicioMaritima());
        responses.add(servicioAerea());
        //responses.add(servicioPaises());
        //responses.add(servicioNavierasAerolineas());
        //responses.add(servicioBarcosAviones());

        return responses;
    }
    public ResponseDTO servicioTerrestre() {
        try {
            ResponseEntity<String> servicioTerrestre = restClient.get()
                    .uri("/paquetesTarifasTerrestre/2/2")
                    .retrieve()
                    .toEntity(String.class);
            return (new ResponseDTO("Roaming Terrestre", servicioTerrestre.getStatusCode().value(), servicioTerrestre.getBody()));
        } catch (HttpClientErrorException e){
            return (new ResponseDTO("Roaming Terrestre", e.getStatusCode().value(), e.getMessage()));
        }

    }

    public ResponseDTO servicioMaritima() {
        try {
            ResponseEntity<String> servicio = restClient.get()
                    .uri("/paquetesTarifasMaritima/2/2")
                    .retrieve()
                    .toEntity(String.class);
            return (new ResponseDTO("Roaming Marítima", servicio.getStatusCode().value(), servicio.getBody()));
        } catch (HttpClientErrorException e) {
            return (new ResponseDTO("Roaming Marítima", e.getStatusCode().value(), e.getMessage()));
        }
    }

    public ResponseDTO servicioAerea() {
        try {
            ResponseEntity<String> servicio = restClient.get()
                    .uri("/paquetesTarifasAerea/2/2s")
                    .retrieve()
                    .toEntity(String.class);
            return (new ResponseDTO("Roaming Aérea", servicio.getStatusCode().value(), servicio.getBody()));
        } catch (HttpClientErrorException.BadRequest e) {
            return (new ResponseDTO("Roaming Aérea", e.getStatusCode().value(), e.getMessage()));
        }
    }

    public ResponseDTO servicioPaises() {
        try {
            ResponseEntity<String> servicio = restClient.get()
                    .uri("/paisesConPaquetesyTarifas/9")
                    .retrieve()
                    .toEntity(String.class);
            return (new ResponseDTO("Roaming Paises", servicio.getStatusCode().value(), servicio.getBody()));
        } catch (HttpClientErrorException.BadRequest e) {
            return (new ResponseDTO("Roaming Paises", e.getStatusCode().value(), e.getMessage()));
        }
    }

    public ResponseDTO servicioNavierasAerolineas() {
        try {
            ResponseEntity<String> servicio = restClient.get()
                    .uri("/lineasConPaquetesyTarifas/3/2")
                    .retrieve()
                    .toEntity(String.class);
            return (new ResponseDTO("Roaming Navieras y Aerolineas", servicio.getStatusCode().value(), servicio.getBody()));
        } catch (HttpClientErrorException.BadRequest e) {
            return (new ResponseDTO("Roaming Navieras y Aerolineas", e.getStatusCode().value(), e.getMessage()));
        }
    }

    public ResponseDTO servicioBarcosAviones() {
        try {
            ResponseEntity<String> servicio = restClient.get()
                    .uri("/trasporteConPaquetesyTarifas/1/2")
                    .retrieve()
                    .toEntity(String.class);
            return (new ResponseDTO("Roaming Barcos y Aviones", servicio.getStatusCode().value(), servicio.getBody()));
        } catch (HttpClientErrorException.BadRequest e) {
            return (new ResponseDTO("Roaming Barcos y Aviones", e.getStatusCode().value(), e.getMessage()));
        }
    }
}

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

    RestClient restClient = RestClient.create();

    private final RestTemplate restTemplate;
    public ApiNubeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public List<ResponseDTO> consultarServiciosApiNube(){

        List<ResponseDTO> responses = new ArrayList<>();

        responses.add(servicioTerrestre());
        responses.add(servicioMaritima());
        responses.add(servicioAerea());

        System.out.println(responses);
        return responses;
    }
    public ResponseDTO servicioTerrestre() {
        try {
            ResponseEntity<String> servicioTerrestre = restClient.get()
                    .uri("http://api-nube.telcel.com/telcel-api-web/api/roaming/paquetesTarifasTerrestre/2/2")
                    .retrieve()
                    .toEntity(String.class);
            return (new ResponseDTO("Roaming Terrestre", servicioTerrestre.getStatusCode().value(), null));
        } catch (HttpClientErrorException.BadRequest e) {
            System.out.println("Error 400: Petición incorrecta");
            return (new ResponseDTO("Roaming Terrestre", 400, e.getMessage()));
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
            return (new ResponseDTO("Roaming Terrestre", 500, e.getMessage()));
        }
    }

    public ResponseDTO servicioMaritima() {
        try {
            ResponseEntity<String> servicio = restClient.get()
                    .uri("http://api-nube.telcel.com/telcel-api-web/api/roaming/paquetesTarifasMaritima/2/2")
                    .retrieve()
                    .toEntity(String.class);
            return (new ResponseDTO("Roaming Marítima", servicio.getStatusCode().value(), null));
        } catch (HttpClientErrorException.BadRequest e) {
            System.out.println("Error 400: Petición incorrecta");
            return (new ResponseDTO("Roaming Marítima", 400, e.getMessage()));
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
            return (new ResponseDTO("Roaming Marítima", 500, e.getMessage()));
        }
    }

    public ResponseDTO servicioAerea() {
        try {
            ResponseEntity<String> servicio = restClient.get()
                    .uri("http://api-nube.telcel.com/telcel-api-web/api/roaming/paquetesTarifasAerea/2/2")
                    .retrieve()
                    .toEntity(String.class);
            return (new ResponseDTO("Roaming Aérea", servicio.getStatusCode().value(), null));
        } catch (HttpClientErrorException.BadRequest e) {
            System.out.println("Error 400: Petición incorrecta");
            return (new ResponseDTO("Roaming Aérea", 400, e.getMessage()));
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
            return (new ResponseDTO("Roaming Aérea", 500, e.getMessage()));
        }
    }
}

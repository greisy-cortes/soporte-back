package com.support.gluo.services;

import com.support.gluo.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiNubeService {

    RestClient restClient = RestClient.create();

    public List<ResponseDTO> consultarServiciosApiNube() throws InterruptedException {
        ResponseEntity<String> servicioTerrestre = restClient.get()
                .uri("http://api-nube.telcel.com/telcel-api-web/api/roaming/paquetesTarifasTerrestre/2/2")
                .retrieve()
                .toEntity(String.class);

        ResponseEntity<String> servicioMaritima = restClient.get()
                .uri("http://api-nube.telcel.com/telcel-api-web/api/roaming/paquetesTarifasMaritima/2/2")
                .retrieve()
                .toEntity(String.class);

        ResponseEntity<String> servicioAerea = restClient.get()
                .uri("http://api-nube.telcel.com/telcel-api-web/api/roaming/paquetesTarifasAerea/2/2")
                .retrieve()
                .toEntity(String.class);

        List<ResponseDTO> responses = new ArrayList<>();

        responses.add(new ResponseDTO("Roaming Terrestre", servicioTerrestre.getStatusCode().value(), null));

        responses.add(new ResponseDTO("Roaming Maritima", servicioMaritima.getStatusCode().value(), null));

        responses.add(new ResponseDTO("Roaming Aerea", servicioMaritima.getStatusCode().value(), null));
        System.out.println(responses);
        return responses;
    }
}

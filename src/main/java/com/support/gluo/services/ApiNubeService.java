package com.support.gluo.services;

import com.support.gluo.externalComponents.ExternalAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ApiNubeService {

    @Autowired
    private ExternalAPIClient externalAPIClient;

    private final WebClient webClient;

    public ApiNubeService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://api-nube.telcel.com").build();
    }
    public Mono<ResponseEntity<String>> getRoamingTerrestre(){
        return this.webClient.get().uri("/telcel-api-web/api/roaming/paquetesTarifasTerrestre/2/1").retrieve().toEntity(String.class);
    }

}

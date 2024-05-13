package com.support.gluo.services;

import com.support.gluo.dto.PaqueteDTO;
import com.support.gluo.dto.Response;
import com.support.gluo.externalComponents.ExternalAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Objects;

@Service
public class ApiNubeService {

    @Autowired
    private ExternalAPIClient externalAPIClient;

    private final WebClient webClient;

    public ApiNubeService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://api-nube.telcel.com").build();
    }
    public Mono<Object> getRoamingTerrestre(){
        return this.webClient.get().uri("/telcel-api-web/api/roaming/paquetesTarifasTerrestre/2/1").retrieve().bodyToMono(Object.class);
    }

}

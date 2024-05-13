package com.support.gluo.externalComponents;

import com.support.gluo.dto.PaqueteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Component
public class ExternalAPIClient {

    @Autowired
    private WebClient webClient;

    public List<PaqueteDTO> getRoamingTerrestreFromApiNube() {
        // Realiza una solicitud GET a la API externa y obtiene los datos
        return (List<PaqueteDTO>) webClient.get().uri("http://api-nube.telcel.com/telcel-api-web/api/roaming/paquetesTarifasTerrestre/2/1").retrieve().bodyToMono(Object.class);
    }
}

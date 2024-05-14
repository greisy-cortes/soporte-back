package com.support.gluo.controllers;

import com.support.gluo.services.ApiNubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping(value = "/api/roaming")
public class PaqueteController {

    @Autowired
    ApiNubeService apiService;

    @GetMapping(value = "/tarifasTerrestre")
    public Mono<ResponseEntity<String>> getRoamingTarifasTerrestre(){

    return apiService.getRoamingTerrestre();
    }
}

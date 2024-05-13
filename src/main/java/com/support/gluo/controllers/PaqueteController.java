package com.support.gluo.controllers;

import com.support.gluo.dto.PaqueteDTO;
import com.support.gluo.dto.Response;
import com.support.gluo.services.ApiNubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

import java.util.List;

@Controller
@RequestMapping(value = "/api/roaming")
public class PaqueteController {

    @Autowired
    ApiNubeService apiService;

    @GetMapping(value = "/tarifasTerrestre")
    public Response getRoamingTarifasTerrestre(){

    return apiService.getRoamingTerrestre();
    }
}

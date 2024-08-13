package com.support.gluo.controllers;

import com.support.gluo.dto.ResponseDTO;
import com.support.gluo.services.ApiNubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/roaming")
public class PaqueteController {

    @Autowired
    ApiNubeService apiService;
    @GetMapping("/consultar-servicios")
    public Map<String, List<ResponseDTO>> consultarServicios(){
        Map<String, List<ResponseDTO>> apiNubeServices = new HashMap<>();
        apiNubeServices.put("PROD", apiService.consultarServiciosApiNube("http://api-nube.telcel.com/telcel-api-web/api/roaming"));
        apiNubeServices.put("QA", apiService.consultarServiciosApiNube("http://bo-uat.telcel.com/telcel-api-web/api/roaming"));
        return apiNubeServices;
    }
}

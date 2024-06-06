package com.support.gluo.controllers;

import com.support.gluo.dto.ResponseDTO;
import com.support.gluo.services.ApiNubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping(value = "/api/roaming")
public class PaqueteController {

    @Autowired
    ApiNubeService apiService;

    @GetMapping("/consultar-servicios")
    public List<ResponseDTO> consultarServicios() throws InterruptedException {
        System.out.println(apiService.consultarServiciosApiNube());
        return apiService.consultarServiciosApiNube();
    }
}

package com.support.gluo.controllers;

import com.support.gluo.business.Perfilador;
import com.support.gluo.obtenerPerfilWSDL.ObtenerPerfilResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/MTServices")
public class MTServicesController {

    @Autowired
    private Perfilador perfilador;
    @PostMapping(value = "/perfilador")
    public ResponseEntity<?> buscarPerfil(@RequestParam String numero){
        ObtenerPerfilResponse response = perfilador.obtenerPerfil(numero);
        System.out.println(response);
        return ResponseEntity.ok().body(response);
    }
}

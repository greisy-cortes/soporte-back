package com.support.gluo.dto;

import lombok.Data;

import java.util.Map;

@Data
public class Tienda {
    private String categoryName;
    private String color;
    private String marca;
    private String modelo;
    private String leyendaMSI;
    private String name;
    private String nombreComercial;
    private String colorName;
    private String pdpUrl;

    private String sku;
    private Map<String, String> stock;




}

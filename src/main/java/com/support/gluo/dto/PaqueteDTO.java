package com.support.gluo.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class PaqueteDTO {

    Integer id;

    String nombre;

    Boolean promoRegalo;

    String estatus;

    Integer prioridad;

    Integer isTelcel;

    @ManyToOne
    @JoinTable(name = "coberturaDTO_id")
    private CoberturaDTO cobertura;

}

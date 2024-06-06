package com.support.gluo.dto;

import lombok.Data;
import org.springframework.http.HttpStatusCode;

@Data
public class ResponseDTO {
    private String serviceName;
    private Integer statusCode;
    private Object body;


    public ResponseDTO(String serviceName, Integer statusCode, Object body) {
        this.serviceName = serviceName;
        this.statusCode = statusCode;
        this.body = body;
    }

    public ResponseDTO() {
    }
}

package com.support.gluo.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Aquí se aplican las reglas CORS para todas las rutas
                .allowedOrigins("http://localhost:8081/")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos HTTP permitidos
                .allowedHeaders("*") // Permite todas las cabeceras
                .allowCredentials(true); // Permite credenciales como cookies, autorización HTTP y tokens cliente SSL
    }
}

package com.upc.travellerservice.shared.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    public OpenAPI keeperPlatformOpenApi(){
        return new OpenAPI()
                .info(new Info().title("Traveller API")
                        .description(
                                "Traveller Application REST API Documentation")
                        .version("v1.0.0")
                        .license(new License().name("Apache 2.0").url("https://springdoc.org")));
    }
}

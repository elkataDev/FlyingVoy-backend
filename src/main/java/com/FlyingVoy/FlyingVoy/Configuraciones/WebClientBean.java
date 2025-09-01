package com.FlyingVoy.FlyingVoy.Configuraciones;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientBean {


    private static final String API_KEY = "LA KEY DE LA API";


    @Bean
    public WebClient webClient (WebClient.Builder builder){
        return builder.baseUrl("http://api.aviationstack.com/v1/flights?access_key=" + API_KEY).build();
    }
}

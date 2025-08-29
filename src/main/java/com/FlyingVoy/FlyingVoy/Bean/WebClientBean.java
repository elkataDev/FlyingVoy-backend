package com.FlyingVoy.FlyingVoy.Bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientBean {


    @Bean
    public WebClient webClient (WebClient.Builder builder){
        return builder.baseUrl("http://api.aviationstack.com/v1/flights").build();
    }
}

package com.FlyingVoy.FlyingVoy;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ApiAvion {


    @Value("${api.key}")
    private String apiKey;

    @Value("${api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate = new RestTemplate();


    //Conecta con la api y devuelve la informacion del numero de vuelo
    public String getFlights(String flightNumber) {
        String url = UriComponentsBuilder.fromHttpUrl(apiUrl)
                .queryParam("access_key", apiKey)
                .queryParam("flight_iata", flightNumber)
                .toUriString();

        return restTemplate.getForObject(url, String.class);
    }



}

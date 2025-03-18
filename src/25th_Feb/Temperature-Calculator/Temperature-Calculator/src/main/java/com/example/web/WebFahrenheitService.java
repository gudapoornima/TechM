package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WebFahrenheitService {
    @Autowired
    private RestTemplate restTemplate;

    private final String serviceUrl = "http://fahrenheit-service";

    public String convertToCelsius(double fahrenheit) {
        return restTemplate.getForObject(serviceUrl + "/toCelsius?fahrenheit={fahrenheit}", String.class, fahrenheit);
    }
}

package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WebCelsiusService {
    @Autowired
    private RestTemplate restTemplate;

    private final String serviceUrl = "http://celsius-service";

    public String convertToFahrenheit(double celsius) {
        return restTemplate.getForObject(serviceUrl + "/toFahrenheit?celsius={celsius}", String.class, celsius);
    }
}

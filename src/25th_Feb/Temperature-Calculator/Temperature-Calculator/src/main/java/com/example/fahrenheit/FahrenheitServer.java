package com.example.fahrenheit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FahrenheitServer {
    public static void main(String[] args) {
        SpringApplication.run(FahrenheitServer.class, args);
    }
}

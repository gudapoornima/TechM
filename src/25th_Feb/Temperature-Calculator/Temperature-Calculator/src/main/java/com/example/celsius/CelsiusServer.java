package com.example.celsius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CelsiusServer {
    public static void main(String[] args) {
        SpringApplication.run(CelsiusServer.class, args);
        System.out.println("Celsius Service is running on port 2020");
    }
}

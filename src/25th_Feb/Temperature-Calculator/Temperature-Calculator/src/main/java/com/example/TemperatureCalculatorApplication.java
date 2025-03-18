package com.example;

import com.example.eureka.EurekaServer;
import com.example.celsius.CelsiusServer;
import com.example.fahrenheit.FahrenheitServer;
import com.example.web.WebServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemperatureCalculatorApplication {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please specify the server to start: eureka, celsius, fahrenheit, or web.");
            return;
        }

        String serverName = args[0].toLowerCase();
        if (args.length == 2) {
            System.setProperty("server.port", args[1]);
        }

        switch (serverName) {
            case "eureka":
                EurekaServer.main(args);
                break;
            case "celsius":
                CelsiusServer.main(args);
                break;
            case "fahrenheit":
                FahrenheitServer.main(args);
                break;
            case "web":
                WebServer.main(args);
                break;
            default:
                System.out.println("Unknown server type: " + serverName);
        }
    }
}

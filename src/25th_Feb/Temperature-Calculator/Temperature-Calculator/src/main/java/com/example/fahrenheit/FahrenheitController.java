package com.example.fahrenheit;

import org.springframework.web.bind.annotation.*;

@RestController
public class FahrenheitController {
    @GetMapping("/toCelsius")
    public String convertToCelsius(@RequestParam double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        return "{\"fahrenheit\": \"" + fahrenheit + "\", \"celsius\": \"" + celsius + "\"}";
    }
}

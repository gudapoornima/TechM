package com.example.celsius;

import org.springframework.web.bind.annotation.*;

@RestController
public class CelsiusController {
    @GetMapping("/toFahrenheit")
    public String convertToFahrenheit(@RequestParam double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        return "{\"celsius\": \"" + celsius + "\", \"fahrenheit\": \"" + fahrenheit + "\"}";
    }
}

package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {
    @Autowired
    private WebCelsiusService celsiusService;

    @Autowired
    private WebFahrenheitService fahrenheitService;

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/convert")
    public String convert(@RequestParam String type, @RequestParam double value, Model model) {
        String result;
        if (type.equals("celsius")) {
            result = celsiusService.convertToFahrenheit(value);
        } else {
            result = fahrenheitService.convertToCelsius(value);
        }
        model.addAttribute("json", result);
        return "result";
    }
}

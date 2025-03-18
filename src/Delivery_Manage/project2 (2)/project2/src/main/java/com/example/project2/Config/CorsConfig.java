package com.example.project2.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow requests from localhost:4200 (Angular frontend)
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:4200")  // Set your frontend URL here
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allowed HTTP methods
                .allowedHeaders("*")  // Allow all headers
                .allowCredentials(true)  // Allow credentials (cookies, etc.)
                .maxAge(3600);  // Cache the CORS response for 1 hour
    }
}

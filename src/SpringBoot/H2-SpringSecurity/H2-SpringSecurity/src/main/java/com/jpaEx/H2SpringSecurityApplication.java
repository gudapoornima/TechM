package com.jpaEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2SpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(H2SpringSecurityApplication.class, args);
        System.out.println("Executing with Security");
    }

}


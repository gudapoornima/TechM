package com.SpringBootEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloEx1 {

	public static void main(String[] args) {
		SpringApplication.run(HelloEx1.class, args);
		System.out.println("Hello, it's my 1st SpringBoot Application");
	}

}

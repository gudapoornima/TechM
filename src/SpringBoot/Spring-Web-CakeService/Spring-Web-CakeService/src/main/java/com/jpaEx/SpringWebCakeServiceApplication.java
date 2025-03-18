package com.jpaEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class SpringWebCakeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebCakeServiceApplication.class, args);
	}

}

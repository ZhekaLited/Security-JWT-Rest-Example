package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SwaggerRestApplication {
	public static void main(String[] args) {
		SpringApplication.run(SwaggerRestApplication.class, args);
	}
}


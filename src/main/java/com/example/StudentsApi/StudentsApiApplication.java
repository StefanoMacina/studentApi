package com.example.StudentsApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsApiApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello";
	}
}

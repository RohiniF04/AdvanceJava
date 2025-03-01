package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TypingSpring{
	@GetMapping("/")
	public String index() {
		return"<h1>HELLO ROHINI</h1>";
	}
	public static void main(String[] args) {
		SpringApplication.run(TypingSpring.class, args);
	}
}

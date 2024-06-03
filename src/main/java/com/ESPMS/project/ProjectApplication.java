package com.ESPMS.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class ProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	// Hello world message on home screen

	@RequestMapping("/")
	public ResponseEntity<String> home() {
		return ResponseEntity.ok("Hello World");
	}
}

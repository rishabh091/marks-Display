package com.example.marksDisplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class MarksDisplayApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(MarksDisplayApplication.class);
		app.run(args);
	}

}

package com.deploy.manual.javaApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JavaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaAppApplication.class, args);
	}

}

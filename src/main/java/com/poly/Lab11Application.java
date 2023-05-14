package com.poly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.poly")
@EntityScan("com.poly")
public class Lab11Application {

	public static void main(String[] args) {
		SpringApplication.run(Lab11Application.class, args);
	}

}

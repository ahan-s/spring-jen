package com.springjen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application Started");
	}
	
	public static void main(String[] args) {
		logger.info("Application Executed...");
		SpringApplication.run(SpringJenApplication.class, args);
	}

}

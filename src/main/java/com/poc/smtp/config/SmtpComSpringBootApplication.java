package com.poc.smtp.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.poc.smtp")
public class SmtpComSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmtpComSpringBootApplication.class, args);
	}

}

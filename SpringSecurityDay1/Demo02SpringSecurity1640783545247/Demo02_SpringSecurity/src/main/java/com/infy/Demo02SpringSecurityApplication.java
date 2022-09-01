package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class Demo02SpringSecurityApplication {
	public static void main(String[] args) {
		SpringApplication.run(Demo02SpringSecurityApplication.class, args);
	}
}

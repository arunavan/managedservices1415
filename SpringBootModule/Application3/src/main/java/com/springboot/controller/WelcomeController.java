package com.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //@Component
public class WelcomeController {
	@GetMapping("/welcome")
	public String getDetails() {
		return " SpringBoot applicaton using Spring Initializer";
		
	}

}

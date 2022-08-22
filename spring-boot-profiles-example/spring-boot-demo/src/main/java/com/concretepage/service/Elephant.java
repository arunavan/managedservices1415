package com.concretepage.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("animal_dev")
public class Elephant implements Animal {
	@Override
	public String getMessage() {
		return "Hello Elephant!";
	}

}

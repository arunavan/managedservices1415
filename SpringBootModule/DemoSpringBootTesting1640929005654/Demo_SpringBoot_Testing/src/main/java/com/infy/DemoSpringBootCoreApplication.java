package com.infy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.infy.controller.CustomerLoginController;
import com.infy.dto.CustomerLoginDTO;

@SpringBootApplication
public class DemoSpringBootCoreApplication implements CommandLineRunner {

	@Autowired
	CustomerLoginController customerLoginController;
	@Autowired
	Environment environment;
	
	public static final Log LOGGER = LogFactory.getLog(DemoSpringBootCoreApplication.class); 
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootCoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {

			CustomerLoginDTO customerLoginDTO = new CustomerLoginDTO();
			customerLoginDTO.setLoginName("harry");
			customerLoginDTO.setPassword("harry123");

			String message = customerLoginController.authenticateCustomer(customerLoginDTO);
			LOGGER.info(environment.getProperty(message));
		} catch(Exception exception) {
			LOGGER.info(environment.getProperty(exception.getMessage()));
		}
		
	}

}
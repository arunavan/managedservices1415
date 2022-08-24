package com.infy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.infy.service.CustomerServiceImpl;

@SpringBootApplication
public class DemoSpringDataQueryCreation003Application implements CommandLineRunner{
	
	private static final Log LOGGER = LogFactory.getLog(DemoSpringDataQueryCreation003Application.class);
	
	@Autowired
	CustomerServiceImpl customerService;

	@Autowired
	Environment environment;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringDataQueryCreation003Application.class, args);
	}
	public void run(String... args) throws Exception {

		 findNameByEmailId();

	}

	public void findNameByEmailId() {
		try {
			String name = customerService.findNameByEmailId("john@infy.com");

			LOGGER.info("Customer name : " + name);

		} catch (Exception e) {

			if (e.getMessage() != null)
				LOGGER.info(environment.getProperty(e.getMessage(),
						"Something went wrong. Please check log file for more details."));
		}
	}

}

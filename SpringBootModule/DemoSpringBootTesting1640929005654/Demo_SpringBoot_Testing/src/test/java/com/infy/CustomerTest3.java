package com.infy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.dto.CustomerLoginDTO;
import com.infy.service.CustomerLoginService;

@SpringBootTest
class CustomerTest3 {
	
	@Autowired
	CustomerLoginService customerLoginService; 

	@Test
	void testAuthenticateCustomer() throws Exception {
		
		CustomerLoginDTO customer = new CustomerLoginDTO();
		customer.setLoginName("harry");
		customer.setPassword("harry123");
		assertEquals("SUCCESS",customerLoginService.authenticateCustomer(customer));
		
	}

}

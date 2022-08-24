package com.infosys;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.service.CustomerLoginServiceImpl;


@SpringBootTest
class CustomerTest123 {

	@Test
	void testAuthenticateCustomer() {
		//fail("Not yet implemented");
		
	}

	@Test
	void testGetSq() {
		CustomerLoginServiceImpl c=new CustomerLoginServiceImpl();
		assertEquals(25,c.getSq(5));
		//fail("Not yet implemented");
	}

	@Test
	void testGetMsg() {
		CustomerLoginServiceImpl c=new CustomerLoginServiceImpl();
		assertEquals("hello",c.getMsg("hello"));
	
		//fail("Not yet implemented");
	}

}

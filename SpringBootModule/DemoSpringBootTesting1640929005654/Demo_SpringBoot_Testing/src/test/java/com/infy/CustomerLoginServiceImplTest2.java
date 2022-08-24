package com.infy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.service.CustomerLoginService;

@SpringBootTest
class CustomerLoginServiceImplTest2 {
@Autowired
CustomerLoginService customerLoginService; 

	
	@Test
	void testGetSq() {
		assertEquals(4,customerLoginService.getSq(2));
		
	}
	
	@Test
	void testGetSqNotEquals() {
		assertNotEquals(10,customerLoginService.getSq(3));
		
	}
	
}

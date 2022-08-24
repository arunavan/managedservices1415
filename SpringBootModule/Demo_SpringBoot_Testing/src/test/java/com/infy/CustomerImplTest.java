package com.infy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;
import com.infy.service.CustomerLoginService;

@SpringBootTest
class CustomerImplTest {
	@Autowired
	CustomerLoginService customerLoginService; // unnessesary for testing 

	@Test
	void testAuthenticateCustomer() throws InfyBankException{
		CustomerLoginDTO c1=new CustomerLoginDTO();
		c1.setLoginName("garry");
		c1.setPassword("garry123");
		Assertions.assertEquals("SUCCESS",customerLoginService.authenticateCustomer(c1));
	//	InfyBankException e=Assertions.assertThrows(InfyBankException.class,()->customerLoginService.authenticateCustomer(c1));
	//	Assertions.assertEquals(InfyBankException.class, e);
		
		
	}

	
	  @Test void testGetSq() {
		  Assertions.assertEquals(36,customerLoginService.getSq(6));
		  }
	  
	  @Test void testGetMsg() {
		  Assertions.assertEquals("infy",customerLoginService.getMsg("infy"));
		  //fail("Not yet implemented");
		  }
	 

}

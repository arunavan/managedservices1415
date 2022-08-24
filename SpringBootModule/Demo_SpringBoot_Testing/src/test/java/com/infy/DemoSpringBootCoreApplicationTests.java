package com.infy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;
import com.infy.service.CustomerLoginService;

@SpringBootTest
public class DemoSpringBootCoreApplicationTests {

	@Autowired
	CustomerLoginService customerLoginService; 
//positive
	@Test
	public void authenticateCustomerTestValidCredentials() throws InfyBankException {
		CustomerLoginDTO customer = new CustomerLoginDTO();
		customer.setLoginName("harry");
		customer.setPassword("harry123");
		//sample inuput used for testing 
		String actual = customerLoginService.authenticateCustomer(customer);//repository
		Assertions.assertEquals("SUCCESS", actual);
	} 
//negative
	  @Test 
	 public void authenticateCustomerTestInValidCredentials() throws
	  InfyBankException { 
		  CustomerLoginDTO customer = new CustomerLoginDTO();
	  customer.setLoginName("monica"); 
	  customer.setPassword("moni123");
	  InfyBankException	  exception=Assertions.assertThrows(InfyBankException.class,()->
	  customerLoginService.authenticateCustomer(customer));
	  Assertions.assertEquals("Service.WRONG_CREDENTIALS", exception.getMessage());
	  }
	 

}
package com.infy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;
import com.infy.service.CustomerLoginService;

@Controller(value="customerLoginController")
public class CustomerLoginController {

	@Autowired
	private CustomerLoginService customerLoginService;

	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws InfyBankException {
		return customerLoginService.authenticateCustomer(customerLoginDTO);
	}
}

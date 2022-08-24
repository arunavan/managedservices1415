package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;
import com.infy.repository.CustomerLoginRepository;

@Service(value="customerLoginService")
public class CustomerLoginServiceImpl implements CustomerLoginService {

	@Autowired
	private CustomerLoginRepository customerLoginRepository;
//BL
	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws InfyBankException {
		String toRet = null;
		CustomerLoginDTO customerLoginFromRepository = 
				customerLoginRepository.getCustomerLoginByLoginName(customerLoginDTO.getLoginName());
		if (customerLoginDTO.getPassword().equals(customerLoginFromRepository.getPassword())) {
			toRet = "SUCCESS";
		} else {
			throw new InfyBankException("Service.WRONG_CREDENTIALS");
		}
		return toRet;
	}
	
	public int getSq( int x) {
		return x*x;
	}
	
	public String getMsg(String msg) {
		return msg;
	}
	
}
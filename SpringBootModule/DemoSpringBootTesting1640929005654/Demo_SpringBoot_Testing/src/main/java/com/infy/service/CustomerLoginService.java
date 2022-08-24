package com.infy.service;

import com.infy.dto.CustomerLoginDTO;
import com.infy.exception.InfyBankException;

public interface CustomerLoginService {
	public String authenticateCustomer(CustomerLoginDTO customerLoginDTO) throws InfyBankException;
	public int getSq(int x);
	public String getMsg(String msg);
}

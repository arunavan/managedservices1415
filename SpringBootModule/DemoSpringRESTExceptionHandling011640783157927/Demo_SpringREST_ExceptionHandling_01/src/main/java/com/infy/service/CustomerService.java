package com.infy.service;

import java.util.List;

import com.infy.dto.CustomerDTO;
import com.infy.exception.InfyBankException;

public interface CustomerService {
	public Integer addCustomer(CustomerDTO customerDTO) throws InfyBankException;
	public CustomerDTO getCustomer(Integer customerId) throws InfyBankException;
	public void updateCustomer(Integer customerId,CustomerDTO customerDTO)throws InfyBankException;
	public void deleteCustomer(Integer customerId)throws InfyBankException;
	public List<CustomerDTO> getAllCustomers() throws InfyBankException;
}

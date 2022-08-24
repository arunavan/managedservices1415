package com.infy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.infy.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
	String findNameByEmailId(@Param("emailId") String emailId);
}
package com.ducat.springboot.swagger.service;

import java.util.List;
import java.util.Optional;

import com.ducat.springboot.swagger.model.Myemployee;

public interface Myservice {

	public List<Myemployee> getEmployeesFromService();
	public Optional<Myemployee> getEmployeeByIdFromService(int eid);

}
package com.ducat.springboot.swagger.dao;

import java.util.List;
import java.util.Optional;

import com.ducat.springboot.swagger.model.Myemployee;

public interface Mydao {

	public List<Myemployee> getEmployeesFromDao();
	public Optional<Myemployee> getEmployeeByIdFromDb(int eid);

}
package com.ducat.springboot.swagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ducat.springboot.swagger.dao.Mydao;
import com.ducat.springboot.swagger.model.Myemployee;

@Service
public class Myserviceimpl implements Myservice {

	@Autowired
	Mydao dao;

	@Override
	public List<Myemployee> getEmployeesFromService() {
		return dao.getEmployeesFromDao();
	}
	@Override
	public Optional<Myemployee> getEmployeeByIdFromService(int eid) {
		return dao.getEmployeeByIdFromDb(eid);
	}
}
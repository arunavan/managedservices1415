package com.ducat.springboot.swagger.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ducat.springboot.swagger.model.Myemployee;
import com.ducat.springboot.swagger.service.Myservice;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value= "/employee")
@Api(value = "MyControllerEmployeeDetails", description = "REST Apis related to Student Entity!!!!")

public class Mycontroller {

	@Autowired
	Myservice service;

	@GetMapping(value= "/v1/getall")
	@ApiOperation(value = "Get list of Employees ", response = Iterable.class)
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), 
			@ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })

	public List<Myemployee> getEmployees() {
		return service.getEmployeesFromService();
	}
	@GetMapping(value= "/v2/getall")
	public List<Myemployee> getEmployeesNew() {
		return service.getEmployeesFromService();
	}
	@GetMapping(value= "/get/{id}")
	public Optional<Myemployee> getEmployeeById(@PathVariable(name= "id") int eid) {
		return service.getEmployeeByIdFromService(eid);
	}
	
	@PostMapping(value="/addcustomer")
	public void addCustomer() {
		System.out.println("customer added");
	}
	
}
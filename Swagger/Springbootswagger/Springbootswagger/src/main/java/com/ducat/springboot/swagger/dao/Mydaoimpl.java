package com.ducat.springboot.swagger.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ducat.springboot.swagger.model.Myemployee;
import com.github.javafaker.Faker;

@Repository
public class Mydaoimpl implements Mydao {

	// Employee list.
	static List<Myemployee> employees;

	static {
		employees = new ArrayList<Myemployee>();

		// To generate the dummy identity for the employees.
		Faker faker = new Faker();

		// Creating dummy employees.
		for(int i=1; i<6; i++) {
			Myemployee emp = new Myemployee();
			emp.setId(i);
			emp.setName(faker.name().fullName());
			emp.setMobile(faker.phoneNumber().cellPhone());
			emp.setAddress(faker.address().fullAddress());

			// Adding the employee records to the list.
			employees.add(emp);
		}
	}

	@Override
	public List<Myemployee> getEmployeesFromDao() {
		return employees;
	}
	@Override
	public Optional<Myemployee> getEmployeeByIdFromDb(int eid) {
		return employees.stream().filter((employee) -> employee.getId() == eid).findFirst();
	}
}
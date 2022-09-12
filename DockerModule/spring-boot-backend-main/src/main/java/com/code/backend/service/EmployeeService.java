package com.code.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.code.backend.exception.ResourceNotFoundException;
import com.code.backend.model.Employee;
import com.code.backend.repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	private EmployeeRepo empRepo;
	
	public EmployeeService(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
	}

	public Employee saveEmployee(Employee employee) {
		return empRepo.save(employee);
	}
	
	public List<Employee> getEmployees() {
		return empRepo.findAll();
	}
	
	public Employee getEmployeeById(long id) {
		Optional<Employee> emp = empRepo.findById(id);
		if (emp.isPresent()) {
			return emp.get();
		} else {
			//return null;
			throw new ResourceNotFoundException("Employee", "Id", id);
		}
	}
	
	public Employee updateEmployee(Employee employee, long id) {
		Employee existingEmployee = empRepo.findById(id).orElseThrow(
					() -> new ResourceNotFoundException("Employee", "Id", id)
				);
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setLastName(employee.getLastName());
		empRepo.save(existingEmployee);
		return existingEmployee;
	}
	
	public void deleteEmployee(long id) {
		empRepo.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Employee", "Id", id)
			);
		empRepo.deleteById(id);
	}

}

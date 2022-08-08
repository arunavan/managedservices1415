package com.ms.HibernateInheritance3;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr2")
public class Manager extends Employee {

	private static final long serialVersionUID = 1L;
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	

}

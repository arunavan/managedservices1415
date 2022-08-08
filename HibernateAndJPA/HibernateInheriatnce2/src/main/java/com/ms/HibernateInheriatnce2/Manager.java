package com.ms.HibernateInheriatnce2;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="mgr1")
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

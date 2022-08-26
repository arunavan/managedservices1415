package com.infosys.infytel.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.infytel.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	
}

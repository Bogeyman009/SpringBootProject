package com.org.demo.jpa;

import org.springframework.data.repository.CrudRepository;

import com.org.demo.data.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
}

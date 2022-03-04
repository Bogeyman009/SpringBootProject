package com.org.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.demo.data.Customer;
import com.org.demo.jpa.CustomerRepository;

@Component
public class AppConfig {
	
@Autowired
private CustomerRepository customerRepository;

@PostConstruct
public void init() {
	customerRepository.save(new Customer("abc","mnm","abc@gmail.com"));

	customerRepository.save(new Customer("abc","mnm","abc@gmail.com"));

	customerRepository.save(new Customer("abc","mnm","abc@gmail.com"));

	customerRepository.save(new Customer("abc","mnm","abc@gmail.com"));
	
	Iterable<Customer> customer1=customerRepository.findAll();
	System.out.println("----------------------------------");
	customer1.forEach((Customer cus)->{
		System.out.println(cus.getId());
	});
	}
}

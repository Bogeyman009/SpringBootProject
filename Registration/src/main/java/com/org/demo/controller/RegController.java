package com.org.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.org.demo.data.Customer;
import com.org.demo.data.Registration;
import com.org.demo.service.CustomerService;

public class RegController {
	@Autowired
	private CustomerService customerService;
	@PostMapping("/new-registraion")
	public @ResponseBody Customer register(@RequestBody Registration registration) {
		return customerService.saveCustomer(mapCustomerData(registration));
	}
	protected Customer mapCustomerData(Registration registration) {
		Customer customer=new Customer(registration.getFirstname(),registration.getLastname(),registration.getEmail());
		customer.setAge(registration.getAge());
		return customer;
	}
}

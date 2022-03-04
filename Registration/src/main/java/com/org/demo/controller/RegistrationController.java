package com.org.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.org.demo.data.Customer;
import com.org.demo.data.Registration;
import com.org.demo.service.CustomerService;

public class RegistrationController {
@Autowired
private CustomerService customerService;

@PostMapping("/registration")
public ResponseEntity<Customer> register(@RequestBody Registration registration){
	Customer customer=customerService.saveCustomer(mapCustomerData(registration));
	return new ResponseEntity<Customer>(customer,HttpStatus.OK);
}
protected Customer mapCustomerData(Registration registration) {
	Customer customer = new Customer(registration.getFirstname(),registration.getLastname(),registration.getEmail());
	customer.setAge(registration.getAge());
	return customer;
}
}

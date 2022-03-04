package com.org.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.org.demo.data.Customer;
import com.org.demo.service.CustomerService;

public class RestController {

	@Autowired
	private CustomerService customerService;
	
	@PutMapping("/customer/{id}")
	public ResponseEntity<?> saveResponse(@RequestBody Customer customer,@PathVariable("id") String id){
		Customer newcustomer =customerService.saveCustomer(customer, id);
		return new ResponseEntity<>(newcustomer,HttpStatus.OK);
	}
	@PatchMapping("/customer/{id}")
	public ResponseEntity<?> updateResource(@RequestParam("email") String email,@PathVariable("id") String id){
		Customer newcustomer =customerService.updateCustomer(email, id);
		return new ResponseEntity<>(newcustomer,HttpStatus.OK);
	}
}

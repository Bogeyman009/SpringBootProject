package com.org.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.demo.data.Customer;
import com.org.demo.jpa.CustomerRepository;
@Service
public class DefaultCustomerServices implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	@Override
	public Customer saveCustomer(Customer customer, String id) {
		// TODO Auto-generated method stub
		Optional<Customer> originalCustomer =customerRepository.findById(Long.valueOf(id));
		return customerRepository.save(customer);
	}

	@Override
	public Customer updateCustomer(String Email, String id) {
		// TODO Auto-generated method stub
		Optional<Customer> originalCustomer=customerRepository.findById(Long.valueOf(id));
		Customer customer =originalCustomer.get();
		customer.setEmail(Email);
		return customerRepository.save(customer);
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		return customerRepository.save(customer);
	}

}

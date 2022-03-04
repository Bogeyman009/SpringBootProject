package com.org.demo.service;

import com.org.demo.data.Customer;

public interface CustomerService {
	public Customer saveCustomer(Customer customer,String id);
	public Customer updateCustomer(String Email,String id);
	public Customer saveCustomer(Customer customer);
}

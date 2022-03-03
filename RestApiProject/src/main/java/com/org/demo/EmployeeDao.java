package com.org.demo;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	private static StoreEmployee list =new StoreEmployee();
	
	
	static {
		list.getEmployeeList().add(new Employee(1,"Amrit","Vats","Amritvats@gmail.com"
				));
		list.getEmployeeList().add(new Employee(2,"Rahul","Ojha","OjhaRahul@gmail.com"
				));
		list.getEmployeeList().add(new Employee(3,"Rajiv","Ranjan","ranjanRajiv@gmail.com"
				));
		
		
	}
	public StoreEmployee getAllEmployees(){
		return list;
	}
	public void addEmployees(Employee employee) {
		list.getEmployeeList().add(employee);
	}
}

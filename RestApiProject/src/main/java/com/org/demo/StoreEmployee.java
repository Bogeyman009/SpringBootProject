package com.org.demo;

import java.util.ArrayList;
import java.util.List;

public class StoreEmployee {
	private List<Employee> employeeList;
	
	public List<Employee> getEmployeeList(){
		if(employeeList==null) {
			employeeList =new ArrayList<Employee>();
		}
		return employeeList;
	}

	/**
	 * @param employeeList the employeeList to set
	 */
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	
	
}

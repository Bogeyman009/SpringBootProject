package com.org.demo;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(path="/employees")
public class Controller {

		@Autowired 
		private EmployeeDao employeeDao;
		
	@GetMapping(
	path="/",
	produces="application/json")
	public StoreEmployee getEmployees() {
		return employeeDao.getAllEmployees();
	}
	
	@PostMapping(path="/",consumes="application/json",produces = "application/json")
	public ResponseEntity<Object> addEmployee(@RequestBody Employee employee){
		Integer id=employeeDao.getAllEmployees().getEmployeeList().size()+1;
		employee.setId(id);
		employeeDao.addEmployees(employee);
		URI location=ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(
                    employee.getId())
                .toUri();

             return ResponseEntity
          .created(location)
          .build();
		
	}
	
}

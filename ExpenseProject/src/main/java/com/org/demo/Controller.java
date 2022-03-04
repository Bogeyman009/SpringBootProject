package com.org.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Controller {

	@Autowired
	private ExpenseRepository expenseRepository;
	
	@PostMapping("/entering")
	public ResponseEntity<Expense> getdata(@RequestBody Items item){
		Expense exp=expenseRepository.save(map)
		
	}
}

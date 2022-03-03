package com.org.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class Controllers {
	@Autowired
	JdbcTemplate jdbc;
	
	@RequestMapping("/feedData")
	public String jdx() {
		jdbc.execute("Insert into batch7 values(101,'abc'),(102,'xyz'),(103,'great')");
		return "data stored";
	}
	@RequestMapping("/getData")
	public String getData() {
		jdbc.execute("update batch7 set name='Amrit' where id=102 ");
		return "Data is here";
	}
	
	
	
}

package com.org.spring.autoWiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.org.spring.autoWiring")

public class AppConfig {
	
	@Bean
	public Department getDepartment() {
		return new DepartmentImp();
	}
}

package com.org.spring.autoWiring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext con =new AnnotationConfigApplicationContext(AppConfig.class);
		
		Company com=con.getBean(Company.class);
		com.showDepartmentInfo();
		con.close();
	}

}

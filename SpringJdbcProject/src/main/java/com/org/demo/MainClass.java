package com.org.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.micrometer.core.instrument.MeterRegistry.Config;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext appcon =new AnnotationConfigApplicationContext(Config.class);
EmployeeDao emp=appcon.getBean(EmployeeDao.class);
String empName=emp.getEmployeeName(3);
System.out.println("Employee name is "+empName);
appcon.close();
	}

}

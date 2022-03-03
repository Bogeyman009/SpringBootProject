package com.org.Ecommerce;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
 public static void main(String[] args) {
	AnnotationConfigApplicationContext appcon=new AnnotationConfigApplicationContext(Config.class);
	CheckOut cout=appcon.getBean(CheckOut.class);
	cout.Service();
 	}
}

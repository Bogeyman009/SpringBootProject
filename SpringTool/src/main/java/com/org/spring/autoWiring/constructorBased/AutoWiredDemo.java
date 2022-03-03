package com.org.spring.autoWiring.constructorBased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.spring.autoWiring.AppConfig;

public class AutoWiredDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext appon=new AnnotationConfigApplicationContext(AppConfig.class);

	}

}

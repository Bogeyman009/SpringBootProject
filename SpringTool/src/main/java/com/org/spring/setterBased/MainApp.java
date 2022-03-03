package com.org.spring.setterBased;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	@SuppressWarnings("resource")
	ClassPathXmlApplicationContext appcon=new ClassPathXmlApplicationContext("applicationContext.xml");
	System.out.println("Loading....");
	UrbanClap uc=appcon.getBean("myNeighhome",UrbanClap.class);
	System.out.println(uc.cleaning());
	System.out.println(uc.decorating());
	appcon.close();
	}

}

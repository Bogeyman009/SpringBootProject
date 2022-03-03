package com.org.spring.constructorBased;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
ClassPathXmlApplicationContext appcon=new ClassPathXmlApplicationContext("applicationContext.xml");
System.out.println("Loading....");
Coach c=appcon.getBean("mycoach",Coach.class);
System.out.println(c.getDailyFortune());
System.out.println(c.workOut());
appcon.close();
}

}

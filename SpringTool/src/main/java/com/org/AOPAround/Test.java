package com.org.AOPAround;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext anncon =new AnnotationConfigApplicationContext(AOPConfig.class);

Operation op =anncon.getBean("Operation",Operation.class);
op.msg();
	}

}

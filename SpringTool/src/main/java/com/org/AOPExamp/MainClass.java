package com.org.AOPExamp;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext appcon=new AnnotationConfigApplicationContext(DemoAOP.class);

StudentAccountDao stu=appcon.getBean("stu",StudentAccountDao.class);
StudentAccountDao1 stu1=appcon.getBean("stu1",StudentAccountDao1.class);
stu1.newAccount();

//////////////////////////////////////////////////////
List acc=null;
try {
	boolean obj=true;
	acc=stu.findAcc(obj);
} catch (Exception e) {
	// TODO: handle exception
	System.out.println("----------------");
	System.out.println("caught the exception");
}
appcon.close();
	}

}

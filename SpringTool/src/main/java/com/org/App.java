package com.org;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 Hello world!
 
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext appcon=new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Sim s= appcon.getBean("mysim",Sim.class);
        System.out.println(s.calling());
        
        Sim s1= appcon.getBean("myjio",Sim.class);
        System.out.println(s1.calling());
        System.out.println(s1.message());
        
        appcon.close();
        
    }
}

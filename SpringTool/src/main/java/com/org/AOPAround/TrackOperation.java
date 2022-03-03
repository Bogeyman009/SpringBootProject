package com.org.AOPAround;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	@Pointcut("Execution(*Operation.*(..))")
	public void k() {}
	
//	@Before("k()")
//	public void myAdvice(JoinPoint p) {
//		System.out.println("Additional concern");
//	}
	
	@After("K()")
	public Object myAdvice(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("Additional Concern before calling actual method");
		Object obj=pjp.proceed();
		System.out.println("Additional concern after calling actual method");
		return obj;
	}
}

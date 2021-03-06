package com.org.AfetrThrow;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {

	@Pointcut("Execution(*Operation.*(..))")
	public void k() {}
	
	@Before("k()")
	public void myAdvice(JoinPoint p) {
		System.out.println("Additional concern");
	}
}

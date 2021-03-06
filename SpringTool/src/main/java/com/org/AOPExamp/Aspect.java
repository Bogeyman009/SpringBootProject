package com.org.AOPExamp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {
	@After(" execution(* com.org.AOPExamp.*.*(..))")
	public void afterFindAccount(JoinPoint thejp) {
		String s=thejp.getSignature().toShortString();
		System.out.println(("execution the @After advice on the method : "+s));
	}
	@AfterThrowing(pointcut = "execution(*com.org.AOPExamp.*.*(..))",throwing ="theException")
	public void afterThrowingFindAccount(JoinPoint joinPoint,Throwable theException) {
		String str=joinPoint.getSignature().toShortString();
		System.out.println("\n Executiong the @ afterThrowing on method "+str);
		System.out.println("The Execution is : "+theException);
	}
	@Before("Execution (public void newAccount())")
	public void BeforeNewAccount() {
		System.out.println("@Before advice - execution the @Before advice for new account");
	}
}

package com.org.Ecommerce;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectForum {
	@Before("com.org.Ecommerce.CheckOut")
	public void authentication() {
		System.out.println("You are authorised");
	}
}

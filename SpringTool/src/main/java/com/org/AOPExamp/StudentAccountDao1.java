package com.org.AOPExamp;

import org.springframework.stereotype.Component;

@Component
public class StudentAccountDao1 {
	public void newAccount() {
		System.out.println(getClass()+ " to open a new account");
	}
}

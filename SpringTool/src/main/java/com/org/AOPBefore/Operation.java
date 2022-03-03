package com.org.AOPBefore;

import org.springframework.stereotype.Component;

@Component
public class Operation {
	public void msg() {
		System.out.println("Msg method incoked");
	}
	public int m() {
		return 2;
	}
	public int k() {
		return 3;
	}
}

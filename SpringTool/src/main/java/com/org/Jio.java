package com.org;

public class Jio implements Sim{

	@Override
	public String calling() {
		// TODO Auto-generated method stub
		return "Welcome to JIO services......!!";
	}
	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "Hello! This is Manoj";
	}
	public void doStartUp() {
		//init method
		System.out.println("My Jio sim is started :init method");
	}
	
	public void doShutDown() {
		//destroy method
		System.out.println("My Jio sim is shutdown  : Destroy method");
	}
	
	
}

package com.org;

public class Airtel implements Sim {

	@Override
	public String calling() {
		// TODO Auto-generated method stub
		return "Welcome to airtel service .....!!";
	}
	public void doStartUp() {
		//init method
		System.out.println("My Airtel sim is started :init method");
	}
	
	public void doShutDown() {
		//destroy method
		System.out.println("My Airtel sim is shutdown  : Destroy method");
	}
	@Override
	public String message() {
		// TODO Auto-generated method stub
		return null;
	}
}

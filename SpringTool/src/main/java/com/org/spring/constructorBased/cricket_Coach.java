package com.org.spring.constructorBased;

public class cricket_Coach implements Coach {
	private Fortune fortune;
	
	public cricket_Coach(Fortune fortune) {
		super();
		this.fortune=fortune;
	}
	@Override
	public String workOut() {
		// TODO Auto-generated method stub
		return "daily one houe running";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.fortuneService();
	}

}

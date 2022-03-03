package com.org.spring.setterBased;

public class NeighboursHome implements UrbanClap {

	private Organiser organiser;
	

	public void setOrganiser(Organiser organiser) {
		this.organiser = organiser;
		System.out.println("Setter method of Orgnaising interface");
	}

	@Override
	public String cleaning() {
		// TODO Auto-generated method stub
		return "We do Cleaning";
	}

	@Override
	public String decorating() {
		// TODO Auto-generated method stub
		return organiser.service1();
	}

}

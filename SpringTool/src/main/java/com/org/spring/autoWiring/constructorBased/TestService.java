package com.org.spring.autoWiring.constructorBased;

public class TestService {
	private SampleService sampleservice;

	public TestService(SampleService sampleService) {
		this.sampleservice=sampleService;
		// TODO Auto-generated constructor stub
	}
}

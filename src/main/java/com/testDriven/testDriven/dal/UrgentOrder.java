package com.testDriven.testDriven.dal;

public class UrgentOrder implements Order  {

	@Override
	public void process() {
		System.out.println("It is an urgent Order");
		
	}

}

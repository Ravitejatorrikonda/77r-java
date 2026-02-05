package com.interfacee.vehicle;

public class Bike implements Vehicle {

	public void startEngine() {
		System.out.println("start the bike engine");
	}

	@Override
	public void stopEngine() {
		System.out.println("Stop the bike engine");
		
	}

	@Override
	public void accelarate() {
		System.out.println("accelarate the bike ");
		
	}

	@Override
	public void vehicleBreak() {
	System.out.println("applying breaks to the bike");
		
	}
	
}

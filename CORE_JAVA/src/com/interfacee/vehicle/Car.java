package com.interfacee.vehicle;

public class Car implements Vehicle {

	@Override
	public void startEngine() {
		System.out.println("start the car engine");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("stop the Car engine");
		
	}

	@Override
	public void accelarate() {
		System.out.println("accelerate the car ");
		
	}

	@Override
	public void vehicleBreak() {
		System.out.println("applying breaks to the car");
		
	}

}

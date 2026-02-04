package com.absgtraction2;

public abstract class Vehicle {
	String modelName, vehicleNumber, company;
	
	public Vehicle(String modelName,String vehicleNumber,String company) {
		this.modelName=modelName;
		this.vehicleNumber=vehicleNumber;
		this.company=company;
	}

	void startEngine() {
		System.out.println("hello");
	}
	
	abstract void pollutionCheck();
	public void fuelType() {
		System.out.println("Most vehicles use petrol by default");
	}
	
	
}

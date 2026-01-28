package com.inheritance.task;

import java.security.cert.TrustAnchor;

class vehicle{
	String make;
	String model;
	int year;
	public vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public void displayInfo() {
		System.out.println("Vehicle model: "+this.model);
		System.out.println("Vehicle make: "+this.make);
		System.out.println("year : "+this.year);
	}
	
	
}

class Car extends vehicle{
	int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}
	
	public void displayCarInfo(){
		System.out.println("Vehicle model: "+this.model);
		System.out.println("Vehicle make: "+this.make);
		System.out.println("year : "+this.year);
		System.out.println("Number Of doors : "+this.numberOfDoors);
	}
}
class Truck extends vehicle{
	int cargoCapacity;

	public Truck(String make, String model, int year, int cargoCapacity) {
		super(make, model, year);
		this.cargoCapacity = cargoCapacity;
	}
	public void displayTruckInfo() {
		System.out.println("Vehicle model: "+this.model);
		System.out.println("Vehicle make: "+this.make);
		System.out.println("year : "+this.year);
		System.out.println("cargo  Capacity : "+ this.cargoCapacity);
	}
}
public class Task {
public static void main(String[] args) {
	vehicle vh=new Car("Tayota", "corolla", 2022, 4);
	vh.displayInfo();
//	System.out.println("------------------");
//	Car car= (Car)vh;
//	car.displayCarInfo();
	System.out.println("===================");
	Truck truck= (Truck)vh;
	truck.displayTruckInfo();
}
}







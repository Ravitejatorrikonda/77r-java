package com.interfacee.vehicle;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vehicle;
		
		vehicle=new Bike();
		vehicle.startEngine();
		vehicle.stopEngine();
		vehicle.accelarate();
		vehicle.vehicleBreak();

	}

}

package com.absgtraction2;

public class vehicleMain {

	public static void main(String[] args) {
		Vehicle veh;
		veh=new Car("sedan", "1234", "maruthi", 4, false);

		veh.startEngine();
		veh.fuelType();
		System.out.println("-----------------");
		
		veh=new Truck("Tata", "1234", "tata", 20000);
		veh.startEngine();
		veh.fuelType();
		
		/**
		 * interfaces
		 * anonymous class
		 * object methods->11 methods
		 * grabge collectore->
		 * 
		 * 
		 * 
		 * 
		 */
		
		
	}

}

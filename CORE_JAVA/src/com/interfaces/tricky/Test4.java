package com.interfaces.tricky;

interface Vehicle{
	void startEngine();
	void stopEngine();
	
	  default void digitalMeter() {
		  System.out.println("this is digital meter");
	  }
}
class Car implements Vehicle{

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void digitalMeter() {
		System.out.println("this is touch screen implementation");
	}
	
}
class Bike implements Vehicle{

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		
	}
	
}



public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

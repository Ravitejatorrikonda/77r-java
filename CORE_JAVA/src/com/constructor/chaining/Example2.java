package com.constructor.chaining;
//parent
//class X{
//	
//	public X(int a) {
//		System.out.println(a);
//	}
//	public X() {
//		this(34);
//		System.out.println(" no parameterized constyructor");
//	}
//	
//}
//
//
//class Y extends X{
//	public Y() {
//		this("java is awesome");
//		System.out.println("child constructor");
//	}
//	public Y(String str) {
//		
//		System.out.println(str);
//	}
//}

//java is awesome,child constructor,
//34 no parameterized, java is awesome, child constructor

//
//class X{
//	int a;
//	public X(int a) {
//		this.a=a;
//		System.out.println("X constructor");
//	}
//	
//}
//class Y extends X{
//	public Y(int a) {
//		super(a);
//		System.out.println("Y constructor");
//	}
//	
//}
//class Z extends Y{
//	public Z() {
//		super(34);
//		System.out.println("Z constructor");
//	}
//	
//}




//class Bicycle{
//	String tyre;
//	String handile;
//	String dic;
//	String brakes;
//	
//	
//	
//	public Bicycle(String tyre, String handile, String dic, String brakes) {
//		
//		this.tyre = tyre;
//		this.handile = handile;
//		this.dic = dic;
//		this.brakes = brakes;
//		System.out.println("Bicycle object creatred");
//	}
//
//
//
//	public void applyingBrakes() {
//		System.out.println("Bicycle stpp mooving");
//	}
//	
//}
//
//class Bike extends Bicycle{
//	String engine;
//	String headlight;
//	String mileage;
//	public Bike(String tyre, String handile, String dic, String brakes,
//			String engine, String headlight, String mileage) {
//		super(tyre, handile, dic, brakes);
//		
//		this.engine=engine;
//		this.headlight=headlight;
//		this.mileage=mileage;
//		System.out.println("Bike object created");
//	}
//	
//	public void applyingBrakes() {
//		System.out.println("Bike stop mooving");
//	}
//	
//	
//	
//}



class X{
	String name="java is awesome from the parent";
	public void display() {
		System.out.println(name);
	}
	
}

class Y extends X{
	String name="java is awesome from the child";
	
	public void display() {
//		super.display();
		System.out.println(super.name);
	}
}


public class Example2 {
	
	public static void main(String[] args) {
		
		Y y=new Y();
		y.display();
		
		
		
		
//	Bike bike=new Bike("MRF tyre","cafe raider","abs","Disc","petrol engine","LED headlight","34");
//		
//	System.out.println(bike.tyre);
//	bike.applyingBrakes();
	
	
	}

}

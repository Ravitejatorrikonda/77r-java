package com.wrapper;

public class Example {
	
	
	
	public static void manualBoxing() {
		
//		int a=10;
//		Integer num1=Integer.valueOf(20);
		
		Integer i1=new Integer(34);
		Integer i2=new Integer(34);
		System.out.println(i1==i2);
		
		
	}
	
	public static void autoBoxing() {
		Integer i1=130;//100x
		Integer i2=130;//200x
		System.out.println(i1==i2);
		
		
		
	}
	

	public static void main(String[] args) {
//		autoBoxing();
		manualBoxing();
		

	}

}

package com.method.overloading;

public class Example1 {
	
	public void add(short a,short b) {
		System.out.println("short : "+(a+b));
	}

	public void add(int a, int b) {
		System.out.println("Int :" + (a + b));
	}

	public void add(double a, double b) {
		System.out.println("double :" + (a + b));
	}
	
	public void add(float i, float j) {
		System.out.println("float :"+(i+j));
	}

	public static void main(String[] args) {
		
//		short s1=20;
//		int s2=30;
        new Example1().add(2.3f,3.4f);

	}

}

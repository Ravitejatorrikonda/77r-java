package com.method.overloading;

public class Example3 {
	
	public void display(String x) {
		System.out.println("String");
	}
	public void display(Example3 a) {
		System.out.println("object");
	}
	
	
	public static void main(String[] args) {
	
//		System.out.println(null);
		String str=null;
		new Example3().display(str);

	}

}

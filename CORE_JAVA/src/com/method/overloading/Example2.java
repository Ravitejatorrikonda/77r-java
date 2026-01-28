package com.method.overloading;

public class Example2 {
	
//	public void print(int a) {
//		System.out.println("Int");
//	}
	
//	public void print(long a) {
//		System.out.println("long");
//	}
//	
	
	public void print(byte a) {
		System.out.println("byte");
	}

	
	public void print(Integer i) {
		System.out.println("Integer");
	}
	public static void main(String[] args) {
		new Example2().print(30);

	}

}

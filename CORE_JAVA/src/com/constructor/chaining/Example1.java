package com.constructor.chaining;

public class Example1 {

	// no param
	public Example1() {
		this(10, 20);

		System.out.println("No parameterized constructor");
	}

	public Example1(int a, int b) {
		this("java is awesome");
		System.out.println(a + b);
		System.out.println("Parameterized con");
	}

	public Example1(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {

		new Example1();
	}

}

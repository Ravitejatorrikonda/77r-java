package com.method.overloading;

class A{
	public void print(int a) {
		System.out.println("Parent class");
	}
}
class B extends A{
	public void print(double b) {
		System.out.println("Child class");
	}
}


public class Example4 {

	
	public static void main(String[] args) {
	B b=new B();
	b.print(34);


	}

}

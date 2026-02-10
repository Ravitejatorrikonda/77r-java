package com.interfaces.tricky;

interface M{
	default void method1() {
		System.out.println("this is parent 1 interface");
	}
}
interface N{
	default void method1() {
		System.out.println("this is parent 2 interface");
	}
}
class O implements M, N{
     public void method1() {
    	 M.super.method1();
    	 System.out.println("child class");
     }
}

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

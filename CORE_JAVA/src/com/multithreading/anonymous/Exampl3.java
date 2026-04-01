package com.multithreading.anonymous;

public class Exampl3 {

	public static void main(String[] args) {
		System.out.println("Main method");
		Thread th1=new Thread(()->System.out.println("Hello There"));
		Thread th2=new Thread(()->System.out.println("Hi There"));
		th1.start();
		th2.start();
		
//		th1.join();
//		th2.join();
		System.out.println("main method ended");

	}

}

package com.multithreading;

class A extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("Main method");
		
		Thread th1=new A();
		Thread th2=new A();
		
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println("Main method ended....");

	}

}

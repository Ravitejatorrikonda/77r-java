package com.multithreading.anonymous;

class A extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}
public class Example1 {

	public static void main(String[] args) {
		System.out.println("main mmethod");
		
		Thread th1=new A();
		
//		Thread th1=new Thread();
		  th1.start();
		  th1.start();
		  
		  System.out.println("main method ended");
		

	}

}

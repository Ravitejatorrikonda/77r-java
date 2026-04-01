package com.multithreading.anonymous;

class B implements Runnable {
	@Override
	public void run() {
		System.out.println("Hello There");

	}
}

public class Example2 {

	public static void main(String[] args) {
//		Runnable runnable = new B();
//		Thread th1 = new Thread(runnable);
//		th1.start();
		
//		Runnable runnable=()-> System.out.println("hello There");
				
			
		
		Thread th1=new Thread(()-> System.out.println("hello There"),"Hi");
		th1.start();

	}

}

package com.multithreading.anonymous;

class Counter{
	int count;
	synchronized void increment() {
		count++;
	}
	
	int getCount() {
		return count;
	}
}

public class Example4 {

	public static void main(String[] args)throws Exception {
		
		Counter counter=new Counter();
		System.out.println("Main method");
		Thread th1=new Thread(()->{
			for(int i=1;i<=1000;i++) {
				counter.increment();
				System.out.println(Thread.currentThread().getName());
	
			}
		});
		
		Thread th2=new Thread(()->{
			for(int i=1;i<=1000;i++) {
				counter.increment();
				System.out.println(Thread.currentThread().getName());
			}
		});
		th1.start();
		th2.start();
		
		
		th1.join();
		th2.join();
//		
		System.out.println(counter.getCount());
//		System.out.println("main method end");

	}

}

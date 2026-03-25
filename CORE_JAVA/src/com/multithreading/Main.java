package com.multithreading;


class Display1 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
}

class Display2 implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
}


public class Main {

	public static void main(String[] args) {
	   System.out.println("main method");
	   Display1 obj1=new Display1();
	   Display2 obj2=new Display2();
	   
	  Thread th1=new Thread(obj1);
	  Thread th2=new Thread(obj2);
	   
	  th1.start();
	  th2.start();
	  
	  System.out.println("main method end ............");
	   
	   

	}

}

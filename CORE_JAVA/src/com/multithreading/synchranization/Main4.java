package com.multithreading.synchranization;

class Printer4 {
	public  synchronized static void print(int n, String name) {
		for (int i = 1; i <= n; i++) {
			System.out.println(name + "-" + i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

//class User3 implements Runnable {
//	@Override
//	public void run() {
//		Printer4.print(5, "amulya");
//
//	}
//}
//class User4 implements Runnable{
//	@Override
//	public void run() {
//		Printer4.print(5, "Kousalya");
//		
//	}
//}

public class Main4 {
	
	public static void main(String[] args) {
	Runnable us1=()->{
		Printer4.print(5, "Ramya");
	};
	Runnable us2=()->{
		Printer4.print(5, "kavya");
	};
		
		Thread th1=new Thread(us1);
		Thread th2=new Thread(us2);
		th1.start();
		th2.start();
	}

}

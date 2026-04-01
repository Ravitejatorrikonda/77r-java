package com.multithreading.synchranization;

class Printer1{
	public void print(int n,String name) {
		for (int i = 1; i <=n; i++) {
			System.out.println(name+"-"+i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class Main2 {

	public static void main(String[] args) {
		Printer1 printer=new Printer1();
		Runnable user1=()->{
			synchronized (printer) {
				printer.print(5, "Raju");
			}
		};
		
		Runnable user2=()->{
			synchronized (printer) {
				printer.print(5, "Rani");
			}
		};
		
		Thread th1=new Thread(user1);
		Thread th2=new Thread(user2);
		
		th1.start();
		th2.start();
		

	}

}

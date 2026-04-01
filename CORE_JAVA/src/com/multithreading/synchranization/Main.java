package com.multithreading.synchranization;


class Printer{
	public void print(int n, String name) {
		for(int i=1;i<=n;i++) {
			System.out.println(name+"-"+i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class User1 implements Runnable{
	Printer printer;
	public User1(Printer printer) {
		this.printer=printer;
	}
	
	@Override
	public void run() {
		synchronized (printer) {
printer.print(5, "Rahul");
		}
		
	}
	
}

class User2 implements Runnable{
	Printer printer;
	public User2(Printer printer) {
		this.printer=printer;
	}
	
	@Override
	public void run() {
		synchronized (printer) {
			printer.print(5, "Vinodh");
		}
		
	}
}



public class Main {

	public static void main(String[] args) {
		Printer printer=new Printer();
		User1 us1=new User1(printer);
		User2 us2=new User2(printer);
		
		Thread th1=new Thread(us1);
		Thread th2=new Thread(us2);
		th1.start();
		th2.start();

	}

}

package com.multithreading.synchranization;

class Printer3 {
	public synchronized void  print(int n, String name) {
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


public class Main3 {

	public static void main(String[] args) {
		Printer3 printer = new Printer3();
		Runnable user1 = () -> {
			printer.print(5, "Subhash");

		};

		Runnable user2 = () -> {
			printer.print(5, "chandra");
		};

		Thread th1 = new Thread(user1);
		Thread th2 = new Thread(user2);
		th1.start();
		th2.start();

	}

}

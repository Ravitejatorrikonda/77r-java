package com.multithreading.synchranization;


class Producer implements Runnable{
	StringBuffer sb;
	
	public Producer() {
		this.sb=new StringBuffer();
	}
	
	@Override
	public void run() {
		try {
			synchronized (sb) {
				for (int i = 0; i <=10; i++) {
					sb.append(i);
					System.out.println(sb);
					Thread.sleep(2000);
				}
				sb.notify();
			}
		} catch (Exception e) {
			System.out.println("Message : "+ e);
		}
		
	}
	
}




class Consumer implements Runnable{
	Producer producer;//new Producer->String buffer run method
	
	public Consumer(Producer producer) {
		this.producer=producer;
	}
	
	@Override
	public void run() {
		try {
			synchronized (producer.sb) {
				System.out.println("i waiting for to exicute the string buffer data in producer");
				producer.sb.wait();
				System.out.println("--------we are consuming the Data---------");
				System.out.println(producer.sb.toString());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}

public class Main5 {

	public static void main(String[] args) {
		
		Producer producer=new Producer();
		Consumer consumer=new Consumer(producer);
		
		Thread th1=new Thread(producer);
		Thread th2=new Thread(consumer);
		
		th2.start();
		th1.start();
		

	}

}

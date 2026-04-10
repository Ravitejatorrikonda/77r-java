package com.filehandling;

import java.io.IOException;

class Demo implements AutoCloseable{
	public void run() {
		System.out.println("Demo class");
	}

	@Override
	public void close() throws Exception {
		System.out.println("resouce is closed");
		
	}
}

class Alpha implements AutoCloseable{
	public void run() {
		System.out.println("Alpha class");
	}

	@Override
	public void close() throws Exception {
	System.out.println(" alpha resouce is closed");
		
	}
}

public class Example9 {

	public static void main(String[] args) throws Exception {
		Demo demo=new Demo();
		Alpha alpha=new Alpha();
		try(demo;alpha;) {
			demo.run();
			alpha.run();
		}

	}

}

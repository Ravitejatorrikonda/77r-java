package com.garbagee;

public class Example1 {
  int a=10;
	
	
	public static void main(String[] args) {
		Example1 obj=new Example1();
		new Example1();
		System.out.println("finished");
		System.gc();
	}
	
		

}

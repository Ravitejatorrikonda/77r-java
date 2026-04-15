package com.innerclasses;

public class Example1 {
	String name = "java";
	class Inner{
		public void getData() {
			System.out.println(name);
		}
	}
	
	

	public static void main(String[] args) {
		Example1 obj = new Example1();
		
		Inner inner=obj.new Inner();
		inner.getData();
		
	}

}

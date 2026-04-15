package com.innerclasses;

//	static String name = "Rani";

//
//	class Demo {
//		public void getData() {
//			System.out.println(name);
//		}
//	}

public class Example2 {
	public void getData() {
		class Demo {
			public void printData() {
				System.out.println("this is local inner class");
			}
		}
		Demo d = new Demo();
		d.printData();
	}

	public static void main(String[] args) {
		Example2 obj = new Example2();
		obj.getData();

	}

}

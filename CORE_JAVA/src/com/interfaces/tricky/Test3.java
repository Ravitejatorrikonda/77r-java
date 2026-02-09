package com.interfaces.tricky;


//class A1{
//	public static void getData() {
//		System.out.println("Hello there");
//	}
//}
//class B1 extends A1{
//	
//}
//
//
//interface X{
//	static void method2() {
//		System.out.println("Hello guys");
//	}
//}
//interface Y extends X{
//	
//}


//interface X{
//	static void getData() {
//		System.out.println("this is static method in interface");
//	}
//}
//
//class Y implements X{
//	
////	void getData(){
////      System.out.println("This is instance method in child");
////     }
//}


interface X{
	static void displayData() {
		System.out.println("this is parent class X");
	}
}
interface Y{
	static void displayData() {
		System.out.println("this is parent class Y");
	}
}
class Z implements X, Y{
	 void displayData() {
	  System.out.println("this is child class");
//	  X.displayData();
	}
}

public class Test3 {

	public static void main(String[] args) {
        Z z=new Z();
        z.displayData();
        
    

	}

}

package com.interfaces.tricky;


interface A{
	String getDetails();//public abstract
}
interface B{
	boolean isEven(int num);
}
class C implements A, B{
	@Override
	public String getDetails() {
		return "Hello this is child class B";
	}
	
	@Override
	public boolean isEven(int num) {
		return num%2==0;
	}
}



public class Test1 {

	public static void main(String[] args) {
	C c=new C();
	
	//Dynamic method approach
	
	A a=c;
	B b=c;
	
	System.out.println(a.getDetails());
	System.out.println(b.isEven(40));

	}

}

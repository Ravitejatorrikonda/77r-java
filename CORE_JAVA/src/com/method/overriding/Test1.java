package com.method.overriding;

class A{
	
	public void getMethod() {
		System.out.println("A class Object");
	}
}
class B extends A{
	@Override
	public void getMethod() {
		System.out.println("B class Object");
	}
}

class Afactory{
	public A getObject() {
		return new A();
	}
	
}
class Bfactory extends Afactory{
	@Override
	public B getObject() {
		return new B();
	}
}



public class Test1 {

	public static void main(String[] args) {
		Afactory fac=new Bfactory();
		       B b=(B)fac.getObject();
		       b.getMethod();

	}

}

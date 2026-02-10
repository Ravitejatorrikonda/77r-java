package com.interfaces.tricky;


interface Alpha{
	default void print() {
		System.out.println("alpha class");
	}
}
interface Beta{
	default void printer() {
		System.out.println("Beta class");
	}
}

class Tester implements Alpha, Beta{
	@Override
	public void print() {
		Alpha.super.print();//Beta.super.printer();    super.print()
		Beta.super.printer();
		System.out.println("Child class alpha");
	}
	public void printer() {
		System.out.println("Child class Beta class");
	}
}

public class Test5 {

	public static void main(String[] args) {
	Tester tester=new Tester();
	Alpha a=tester;
	
	Beta b=tester;
	a.print();
	b.printer();

	}

}

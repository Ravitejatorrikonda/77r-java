package com.packages;

public class X {
	
	int a;
	public void print(int a) {
		System.out.println(this);
	}

	public static void main(String[] args) {
	X x1=new X();
	System.out.println("==============X1 Object==============");
	System.out.println(x1);
	x1.print(40);
	System.out.println("===================x2 object====================");
	X x2=new X();
	
	System.out.println(x2);
	x2.print(40);
	

	}

}

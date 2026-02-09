package com.interfaces.tricky;
interface X1{
	void meth1();
	
}
interface Y1{
	void meth1();
}
class Z1 implements X1, Y1{
	@Override
	public void meth1() {
		System.out.println("this is x1 class");
	}
	
	
}




public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package com.anonymous;

class Parent{
	public void job() {
		System.out.println("Doing Job.....");
	}
}
//class Child extends Parent{
//	@Override
//	public void job() {
//		System.out.println("SF job...........");
//	}
//}


public class Example1 {

	public static void main(String[] args) {
//		anonymous extends parent
//		parent parent=new anonymous();
           Parent parent=new Parent() {
        	   @Override
        	   public void job() {
        		   System.out.println("sf job...........");
        	   }
        	   
           };
           parent.job();

	}

}

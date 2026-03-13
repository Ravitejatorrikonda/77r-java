package com.lambda.exp;

interface Animal {
	int makingSound(String n, int cost);
}

//class Dog implements Animal {
//
//	@Override
//	public void makingSound(String name, int cost) {
//		System.out.println("BOW Bow ......."+name+""+cost);
//
//	}
//
//}

public class Example1 {
	public static void main(String[] args) {
//		Animal ani = new Dog();
//		ani.makingSound("chintu1",40000);
//
//		Animal ani2 = new Animal() {
//
//			@Override
//			public void makingSound(String name, int cost) {
//				System.out.println("Bow Bow 2.........."+name+" "+cost);
//
//			}
//		};
//
//		ani2.makingSound("chintu2",50000);

		// lambda expression

		Animal ani3 =(name, cost)->
			
			cost;
		
		ani3.makingSound("chintu3", 60000);

	}

}

package com.constructor.chaining;

//
//
//class Persion{
//	String name;
//	public Persion(String name) {
//		this.name=name;
//	}
//}
//class Student extends Persion{
//	String name;
//	public Student(String name) {
//		super("Raghu");
//		this.name=name;
//	}
//	public void displayDetails() {
//		System.out.println(super.name);
//		System.out.println(name);
//	}
//}
//


//class Vehicle{
//	
//	public void display() {
//		System.out.println("this is a Vehicle");
//	}
//}
//
//class car extends Vehicle{
//	
//	public void display() {
//		System.out.println("this is a car");
//		super.display();
//	}
//}

class Book{
	public Book() {
		System.out.println("Default Book Constructor");
	}
	
	public Book(String title) {
		System.out.println("Book Tittle : "+ title);
	}
}
class EBook extends Book{
	public EBook() {
		this("java programing");
		}
	public EBook(String title) {
		System.out.println("EBook title : "+title);
	}
}


public class Example3 {
	public static void main(String[] args) {
		new EBook();
	}
	
//	public static void main(String[] args) {
//		new car().display();
//	}

//	public static void main(String[] args) {
//	Student st=new Student("rahul");
//	st.displayDetails();
//	}

}

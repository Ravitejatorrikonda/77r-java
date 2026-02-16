package com.arrays;

import com.business.blc.elc.stu;
import com.business.blc.elc.student;

class Student{
	int rollno;
	String name;
	int [] marks;
	public Student(int rollno, String name, int[] marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	public double caliculateAverage() {
		double sum=0;
		for(int ele:marks) {
			sum +=ele;
		}
		return sum/marks.length;
	}

	
	public String displayDetails() {
		return "Student [rollno=" + rollno + ", name=" + name + ",Average marks=" + caliculateAverage()+ "]";
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		
		Student st1=new Student(101,"raghu",new int[]{50,40,30,40});
		Student st2=new Student(102,"ramu",new int[]{60,40,30,40});
		Student st3=new Student(103,"raju",new int[]{70,40,30,40});
		
		Student [] st= {st1,st2,st3};
		for(Student stt: st) {
			System.out.println(stt.displayDetails());
		}

	}

}

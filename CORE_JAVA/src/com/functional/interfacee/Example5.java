package com.functional.interfacee;
import java.util.function.Function;

class X implements Function<String, Boolean>{
	@Override
	public Boolean apply(String str) {
		return str.length() > 5;
	}
}

class Student{
	private String name;
	private String group;
	public Student(String name, String group) {
		super();
		this.name = name;
		this.group = group;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the group
	 */
	public String getGroup() {
		return group;
	}
	/**
	 * @param group the group to set
	 */
	public void setGroup(String group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", group=" + group + "]";
	}
	
	
}

public class Example5 {

	public static void main(String[] args) {
		Function<String, Boolean> fun=new X();
	System.out.println(fun.apply("java is awesome and torcher"));
	
	
	
	Function<String, String> fun2=new Function<String, String>() {
		public String apply(String str) {
			return str.toUpperCase();
		}
		
	};
	System.out.println(fun2.apply("java is buety"));
	
	
//	Student student=new Student("Ram", "BSC");
	
	Function<Student, String> st=new Function<Student, String>() {
		public String apply(Student st) {
			return st.getName();
		}
	};
	System.out.println(st.apply(new Student("Ram","BSC")));
	

	}

}

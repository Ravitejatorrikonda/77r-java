package com.functional.interfacee;

import java.util.function.Consumer;

//class Demo implements Consumer<String>{
//	@Override
//	public void accept(String str) {
//		System.out.println(str);
//	}
//}

class Employe{
	private String empName;
	private String empDsg;
	public Employe(String empName, String empDsg) {
		super();
		this.empName = empName;
		this.empDsg = empDsg;
	}
	
	@Override
	public String toString() {
		return "Employe [empName=" + empName + ", empDsg=" + empDsg + "]";
	}
	
	
	
}



public class Example1 {
	public static void main(String[] args) {
		Employe emp=new Employe("x", "y");
		
		Consumer<Employe> consumer=new Consumer<Employe>() {
			@Override
			public void accept(Employe emp) {
				System.out.println(emp);
				
			}
		};
		consumer.accept(emp);
		
		
		
		
		
		
//		Consumer<String> consumer=new Demo();
//		consumer.accept("Java is Awesome ");
		
		
//		Consumer<Integer> consumer=new Consumer<Integer>() {
//			public void accept(Integer num) {
//				System.out.println(num);
//			}
//			
//		};
//		consumer.accept(34);
		
		
		
		
		
	}

}

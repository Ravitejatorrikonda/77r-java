package com.functional.interfacee;
import java.util.function.Supplier;



public class Example4 {
	public static void main(String[] args) {
		Supplier<String> sup=new Supplier<String>() {
			public String get() {
				return "Hello there";
			}
		};
		System.out.println(sup.get());
		
		
		
		Supplier<Employe> sup1=new Supplier<Employe>() {
			
			@Override
			public Employe get() {
				
				return new Employe("Raju", "SD");
			}
		};
		System.out.println(sup1.get());
		
	}
	
	

}

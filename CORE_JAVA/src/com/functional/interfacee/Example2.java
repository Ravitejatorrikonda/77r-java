package com.functional.interfacee;

import java.util.function.Predicate;



public class Example2 {
	public static void main(String[] args) {
		Predicate<Integer> predicate=new Predicate<Integer>() {
			public boolean test(Integer i) {
				return i%2==0;
			}
		};
		System.out.println(predicate.test(34));
	}

	
	Predicate<Integer> pred2=new Predicate<Integer>() {
		public boolean test(Integer i) {
			return i%2 !=0;
		}
	};
}

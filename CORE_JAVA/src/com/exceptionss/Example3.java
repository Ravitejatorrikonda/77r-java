package com.exceptionss;

public class Example3 {

	public static void main(String[] args) {
		String str="Hello";
		try {
			System.out.println(str.charAt(20));
		} catch (NullPointerException e) {
			System.out.println(" this is an null pointyer exception");
		}catch(RuntimeException e) {
			System.out.println("this is String outofBonds exception");
		}
		System.out.println("Executed");

	}

}

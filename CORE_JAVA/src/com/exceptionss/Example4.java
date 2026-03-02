package com.exceptionss;

public class Example4 {

	public static void main(String[] args) {
		String str=null;
		try {
			System.out.println(str.toUpperCase());
		} catch (Error e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Executed");

	}

}

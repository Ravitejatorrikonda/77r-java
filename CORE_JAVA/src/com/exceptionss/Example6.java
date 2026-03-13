package com.exceptionss;

public class Example6 {
	public void getEven(int num) throws Exception {
		if (num <= 0) {
			throw new Exception("Zero and negative values are not allowed");
		} else {
			System.out.println(num % 2 == 0 ? "Even" : "!Even");
		}
	}

	public static void main(String[] args) {
		try {
			new Example6().getEven(-1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Method");
	}

}

package com.exceptionss;

class InvaliAgeException extends Exception {
	public InvaliAgeException(String message) {
		super(message);
	}

}

class Student {
	public void checkAge(int age) throws InvaliAgeException {
		if (age < 16) {
			throw new InvaliAgeException("age below 16 not allowed");
		} else {
			System.out.println(age);
		}

	}
}

public class Example9 {

	public static void main(String[] args) {
		try {
			new Student().checkAge(15);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

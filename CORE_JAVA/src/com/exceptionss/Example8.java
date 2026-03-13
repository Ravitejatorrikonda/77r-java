package com.exceptionss;

public class Example8 {
	public void getdata(int num)throws Exception {
		if(num == 0) {
			throw new Exception("Zero Not allowed");
		}else if(num < 0) {
			throw new Exception("Negative values are not allowed");
		}else {
			System.out.println("possible");
		}
	}
	
	public void method2(int age) {
		if(age < 16) {
			throw new RuntimeException("not allowed");
		}else {
			System.out.println(age);
		}
		
	}
	

	public static void main(String[] args) {
		try {
//			new Example8().getdata(-1);
			new Example8().method2(15);
			
		} catch (RuntimeException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main method");

	}

}

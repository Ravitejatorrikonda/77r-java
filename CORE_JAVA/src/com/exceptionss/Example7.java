package com.exceptionss;


class Number{
	public void getEven(int num)throws RuntimeException {
		if(num <=0) {
			throw new RuntimeException();
		}else {
			System.out.println(num);
		}
	}
}
public class Example7 {

	public static void main(String[] args) {
		try {
			new Number().getEven(-1);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

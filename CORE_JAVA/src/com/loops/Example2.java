package com.loops;

public class Example2 {
	public void table(int num, int value) {
		System.out.println(num+"x"+value+"="+num*value);
		
	}
	
	public int getSumofnNaturalNumbers(int num) {
		int sum=0;
		for(int i=1; i<=num;i++) {
			sum = sum+i;
		}
		return sum;
		
	}
	public void getData() {
		for(int i=100; i>=1;i--) {
		if(i%3==0 && i%5==0) {
			System.out.println(i);
		}
		}
	}
	
	
	public void getEven() {
		for(int i=1;i<=200;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Example2 obj=new Example2();
		obj.getData();
		
		
		
		
		
//		obj.getEven();
//	int result=obj.getSumofnNaturalNumbers(10);
//	System.out.println(result);
//		
//	for(int i=1; i<=10;i++) {
//		obj.table(7, i);
//	}
		
	/**
	 * 
	 * Write a java program to find the even numbers 1 - 200 
	 * by the conditional statenments
	 * mathod name->getEven
	 * return ->void
	 * 
	 * 
	 * write a java program to find the division of 3 and 5 numbers up to 100 
	 * in reverse order
	 * 
	 * 
	 * write a java program to find the even numbers up to 1 to 200
	 * and find the odd numbers up to 1 to 200
	 *  output:- even number 2 4 6 8 10 ...........
	 *           odd number 1 3 5 7 9 11...........
	 *  return type ->void
	 *  String evenNumbers="";         
	 * 
	 * 
	 */

	}

}

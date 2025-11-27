package com.loops;

public class Example4 {
	
	public boolean getNeon(int num) {
		int square=num *num;
		int temp=num;
		int sum=0;
		while(square !=0) {
			int rem=square%10;
			sum=sum+rem;
			square /=10;
		}
		return sum == temp;
	}

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++ ) {
			boolean result=new Example4().getNeon(i);
			if(result) {
				System.out.println(i);
			}
		}
		
	}

}

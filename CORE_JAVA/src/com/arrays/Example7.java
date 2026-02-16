package com.arrays;

public class Example7 {
	public static boolean isPalindrome(int num) {
		int temp=num;
		int rev=0;
		while(num !=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num /=10;
		}
		return rev==temp;
				
	}

	public static void main(String[] args) {
	int []arr=utilitiesArrays.getArray();
	for(int ele:arr) {
		if(isPalindrome(ele)) {
			System.out.println(ele);
			System.err.println();
		}
	}

	}

}

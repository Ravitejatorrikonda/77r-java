package com.arrays;

public class Example1 {

	public static void main(String[] args) {
		int [] arr=new int[5];
		//accessing array elements
		System.out.println("first index : "+arr[0]);
		System.out.println("Second index : "+arr[1]);
		System.out.println("Third index : "+arr[2]);
		System.out.println("Fourth index : "+arr[3]);
		System.out.println("Fifth index : "+arr[4]);
		System.out.println("--------------------------");
		
		arr[0]=34;
		arr[4]=43;
		
		System.out.println("first index : "+arr[0]);
		System.out.println("Second index : "+arr[1]);
		System.out.println("Third index : "+arr[2]);
		System.out.println("Fourth index : "+arr[3]);
		System.out.println("Fifth index : "+arr[4]);
		System.out.println("----------------------------");
		System.out.println(arr.length);
		
		
		

	}

}

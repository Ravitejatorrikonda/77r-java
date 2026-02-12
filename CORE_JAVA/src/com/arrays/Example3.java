package com.arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		/**
		 * 
		 * Array in java
		 * --------------
		 * datatype [] arrRef=new datatype[Size];
		 * datatype [] arrref={elemen.......}
		 * datatype [] arrRef=new Dattype[]{element.....}
		 * 
		 * 
		 */
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size of an array : ");
		int size=sc.nextInt();
		int []arr=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+i+" index value : ");
			int ele=sc.nextInt();
			arr[i]=ele;
		}
		System.out.println(Arrays.toString(arr));
		
		
		sc.close();

	}

}

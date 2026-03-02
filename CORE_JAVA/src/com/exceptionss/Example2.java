package com.exceptionss;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Size : ");
	  try {
		  int [] arr=new int[sc.nextInt()];
		  System.out.println(arr[100]);
	} catch (NegativeArraySizeException e) {
		System.err.println(e.getMessage());
	}catch(ArrayIndexOutOfBoundsException e) {
		System.err.println(e.getMessage());
	}catch(RuntimeException e) {
		System.out.println(e.getMessage());
	}
	  System.out.println("Executed");
	  
	  
	  sc.close();
	  
	}

}

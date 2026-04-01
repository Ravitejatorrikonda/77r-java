package com.matrix;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size :");
		int row=sc.nextInt();
		System.out.println("Enter column size : ");
		int column=sc.nextInt();

		int[][] arr = new int[row][column];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter values (" + i + "," + j + ") :");
				arr[i][j] = sc.nextInt();

			}
		}
//		System.out.println(Arrays.toString(arr));
		
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
			 if(i==j) {
				 System.out.println(arr[i][j]);
			 }
			}
		}
//		System.out.println(sum);n

		sc.close();

	}
}

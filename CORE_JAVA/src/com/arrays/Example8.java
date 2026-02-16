package com.arrays;

import java.util.Arrays;

public class Example8 {

	public static void main(String[] args) {
		// sum of elements in an array

		int[] arr1 = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int ele : arr1) {
			sum += ele;
		}
		System.out.println("sum of elements in an array : " + sum);
		// count the elements in array

		int[] arr2 = { 1, 2, 4, 5, 6 };

		int evencount = 0;
		int oddcount = 0;
		for (int ele : arr2) {
			if (ele % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}
		}

		// reverse an array
		int[] arr3 = { 11, 22, 33, 44, 55 };
		for (int i = arr3.length - 1; i >= 0; i--) {
			System.out.println(arr3[i] + " ");
		}
		
		//
		
		int [] arr4= {1,2,3,4,5};
		int [] arr5= {6,7,8,9,10};
		int []arr6=new int[arr4.length+arr5.length];
		for(int i=0; i<arr4.length;i++) {
			arr6[i]=arr4[i];
		}
		for(int i=0; i<arr5.length;i++) {
			arr6[i+arr4.length]=arr5[i];
		}
		System.out.println(Arrays.toString(arr6));
		
		
		
		
		/**
		 * 
		 * find the frequancy of sorted array
		 * i/p:-arr[1,1,1,1,2,2,3,4,5]
		 * o/p:-
		 * frequancy of 1 value: 4
		 * frequancy of 2 value : 2
		 * frequancy of  3 value : 1
		 * frequancy of  4 value : 1
		 * frequancy of  5 value : 1
		 * 
		 * 
		 */
		
		
		
		

	}

}

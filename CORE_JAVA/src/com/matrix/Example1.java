package com.matrix;

import java.util.Arrays;
/**
 * 
 * arr[0][0]=1
 * 
 */

public class Example1 {

	public static void main(String[] args) {
		
//		int rows=3;
//		int cols=3;
		int [][] arr= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
				
		};
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
		     for (int j = 0; j < arr[i].length; j++) {
		    	 System.out.print(arr[i][j]);
				
			}
		     System.out.println();
		}
		
	}

}

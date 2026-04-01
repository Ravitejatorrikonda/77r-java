package com.matrixx;

import java.util.Arrays;

public class addtionOfMatrix {

	//int a=[a,b,c]
	public static void main(String[] args) {
		int [][] a= {{1,2,3},{1,2,3},{1,2,3}};
		int [][]b={{30,2,3},{1,20,3},{1,2,10}};
		int rowsA=a.length;
		int rowsB=b.length;
		
		int colsA=a[0].length;
		int colsB=b[0].length;
		int [][]c=new int[rowsA][colsA];
		if((rowsA==rowsB)&& (colsA==colsB)) {
			
			for (int i = 0; i < rowsA; i++) {
				for (int j = 0; j < colsA; j++) {
					c[i][j]=a[i][j]+b[i][j];
				}
				
			}
			
			int leftSum=0;
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c.length; j++) {
					if(i==j) {
						leftSum=leftSum+c[i][j];
					}
				}
			}
			System.out.println(leftSum);
		
			int rightSum=0;
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c.length; j++) {
					if(i+j==c.length-1) {
						rightSum=rightSum+c[i][j];
					}
				}
				
			}
			System.out.println(rightSum);
			
			
			
		}else {
			System.out.println("Addition of matrix is not possible...");
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.println(Arrays.toString(c[i]));
		}
		
		
		
	}

}

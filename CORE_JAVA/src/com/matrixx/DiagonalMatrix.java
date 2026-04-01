package com.matrixx;

public class DiagonalMatrix {

	public static void main(String[] args) {
		int [][] a= {{1,0,0},{0,1,0},{0,0,1}};
	boolean status=true;
	int d=a[0][0];
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[i].length; j++) {
			if(i!=j) {
				if(a[i][j]!=0) {
					status=false;
					break;
				}
			}else {
				if(a[i][j]!=1) {
					status=false;
					break;
				}
			}
		}
		
	}
	if(status) {
		System.out.println("It is a unit matrix");
	}else {
		System.out.println("it is not a unit matrix");
	}
		

	}

}

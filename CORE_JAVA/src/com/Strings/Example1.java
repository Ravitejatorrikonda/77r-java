package com.Strings;

public class Example1 {

	public static void main(String[] args) {
	String str="ABCDEFGH";
	//  i=1
	for(int i=0;i<str.length();i++) {
		      //j=1+1=2
		for(int j=i+1;j<=str.length();j++) {
			          //                     0,2
			String st=str.substring(i,j);
			if(st.length()==4) {
				System.out.println(st);
			}
		}
	}
	
	}

}

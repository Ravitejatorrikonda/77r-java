package com.Strings;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
//		String str1="java ";
//		String str2="is awesome";
//		String str3=str1+str2;
//		String str4="java is awesome";
//		System.out.println(str3==str4);
		
		
//		String str1="java";
//		String str2=new String("Java");
//		System.out.println(str1==str2);
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equalsIgnoreCase(str2));
//		
//		str2.concat(" is awesome");
//		System.out.println(str2);
//		
//		StringBuilder str3=new StringBuilder("java");
//		System.out.println(str3);
//		str3.append("is awesome");
//		System.out.println(str3);
		
		
//		String str="java";
//		char[] charArray=str.toCharArray();
//		System.out.println(charArray);
//		System.out.println(Arrays.toString(charArray));
		
		
//		String str1="java";
//		String str2=new String("java");
//		System.out.println(str1==str2.intern());
		
		
		
		/**
		 * 
		 * String builder->1.5->
		 * 
		 * String buffer->safe->
		 * 
		 */
		
		StringBuffer str=new StringBuffer("java ");
		str.append(" is ").append("awesome");
		System.out.println(str.reverse().toString().trim());
		/**
		 * 
		 * String name="Name@1234"
		 * z
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
        
	}

}

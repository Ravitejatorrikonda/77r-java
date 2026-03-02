package com.exceptionss;

public class Example1 {
	public static void main(String[] args) {
         
        	 String str=null;
        	 try {
        		 System.out.println(str.toUpperCase());//->
            	//skip
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			}
        	 System.out.println("Java");
	}
}

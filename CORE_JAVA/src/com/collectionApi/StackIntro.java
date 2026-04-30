package com.collectionApi;

import java.util.Enumeration;
import java.util.List;
import java.util.Stack;

public class StackIntro {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack();
		
		
		st.push(43);
		st.push(34);
		st.push(34);
		
		st.push(null);
//		st.pop();
//		st.pop();
		System.out.println(st.elementAt(1));
		
		
//		Enumeration<Integer> en= st.elements();
//		while(en.hasMoreElements()) {
//			System.out.println(en.nextElement());
//		}
////		
		
		
//		System.out.println(st);
		

	}

}

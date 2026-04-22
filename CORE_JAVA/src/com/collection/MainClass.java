package com.collection;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
//		ArrayList a=new ArrayList();
//		
//		a.add(34);
//		a.add(34.4);
//		a.add("Hello");
//		
//		System.out.println(a.toString());
//		
//	int a1=(int) a.get(0);
//	System.out.println(a1);
		
		
		
//		List<String> a=new ArrayList();
//		a.add("Hello");
//		System.out.println(a);
//		    String s=a.get(0);
//		    System.out.println(s);
		
//		
//		ArrayList<Integer> generic=new ArrayList();
//		generic.add(43);
//		
//		ArrayList raw=generic;
//		raw.add(34);
//		raw.add("Hello");
//		
//		String s= (String) raw.get(1);
//		System.out.println(s);
//		
//		int i= (int) raw.get(0);
//		System.out.println(i);
		
//		for(Object obj:raw) {
//			System.out.println(obj);
//		}
		
		List<String> g=new ArrayList<String>();
		
		g.add("Apple");
		g.add("Banana");
		g.add("watermelon");
		
		System.out.println(g);
		
		for (int i = 0; i < g.size(); i++) {
			System.out.println(g.get(i));
		}
		
		

	}

}

package com.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Example1 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		//1.add();
		list.add("Apple");
		list.add("mango");
//		list.add("Orange");
//		list.add("banana");
//		list.add("pineapple");

		
//		System.out.println(list.toString());
		
		//2.get();
		
//		System.out.println(list.get(0));
		
		
		//3.size();
//		System.out.println(list.size());
		
		//4.set(index,object);
//		list.set(1, "kiwi");
//		System.out.println(list.set(1, "kiwi"));
		
		
		//5.remove();
		
//		list.remove(0);
//		System.out.println(list.remove(0));
		
		//6.getFirst();
//		System.out.println(list.getLast());
		
		//indexOf();
		
//		System.out.println(list.indexOf("Apple"));
//		System.out.println(list.lastIndexOf("Apple"));
		
		
		//isEmpty();
		
//		list.removeAll(list);
//		
//		System.out.println(list.isEmpty());
		
		
//		
//		ArrayList<String>  obj=new ArrayList<String>(Arrays.asList("blueberry","grapes","strawberry"));
//		list.addAll(obj);
//		System.out.println(list);
		
		
//		Object[] a=  list.toArray();
//		System.out.println(Arrays.toString(a));
	
		
		//clone();
//		System.out.println(list);
//		ArrayList<String> obj=  (ArrayList<String>) list.clone();
//		System.out.println(obj);
		
		
		
		//contain()
		
//		System.out.println(list.contains("banana"));
		
		
		//Iterable ->Interface->collection
		
		//Iterable is not only for the array list, overal all collection
		//
		
		Iterator<String> it=list.iterator();
		
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		
		     
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
	}

}

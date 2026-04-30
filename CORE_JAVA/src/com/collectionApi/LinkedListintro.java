package com.collectionApi;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class LinkedListintro {

	public static void main(String[] args) {
		
		
		
		Vector<Integer> v=new Vector<Integer>();
		
		v.add(34);
		v.add(43);
		v.add(43);
		
		System.out.println(v);
		
		Iterator<Integer> en=v.iterator();
		while (en.hasNext()) {
		
			System.out.println(en.next());
		
			
			
		}
		System.out.println(v);
		
		
		
//	    List l=new LinkedList();
//	        l.add(34);
//	        l.add(43);
//	        l.add(43);
//	        l.add("hello");
//
//	        System.out.println(l);
//	        
//	        ListIterator<Integer> li=l.listIterator(l.size());
//	        while(li.hasPrevious()) {
//	        	System.out.println(li.previous());
//	        }
	        
	        
	        
	        
	        
	        
	        
//	        while (li.hasNext()) {
//				  System.out.println(li.next());
//
//			}
//	        l.remove(0);
//	        System.out.println(l);
	    

	}

}

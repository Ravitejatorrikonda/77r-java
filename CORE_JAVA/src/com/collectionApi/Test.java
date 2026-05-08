package com.collectionApi;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		String s = "Hai how are HHHHH YYYY GGGG you 12345678";
		
		ArrayList<Character> a=new ArrayList<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if((ch > 'a' && ch < 'z') && !a.contains((char)(s.charAt(i)-32))) {
				a.add((char)(s.charAt(i)-32));
			
			}
		}
		System.out.println(a);

//		ArrayList<Character> a = new ArrayList<Character>();
//
//		for (int i = 0; i < s.length(); i++) {
//
//			char ch = s.charAt(i);
//			if (ch > '0' && ch < '9') {
//				a.add(s.charAt(i));
//			}

//			if(Character.isDigit(s.charAt(i))) {
//			 a.add(s.charAt(i));
//			}
//		}
//		System.out.println(a);

//		Ex-2:-with collection
//		ArrayList<Character> a=new ArrayList<Character>();
//		
//		for (int i = 0; i < s.length(); i++) {
//			if(!a.contains(s.charAt(i))) {
//				a.add(s.charAt(i));
//			}
//			
//		}
//		
//		System.out.println(a);

//		Ex:-1:- withou collection
//		String s="Hai how are you";
//            StringBuilder sb=new StringBuilder("");
//            for (int i = 0; i < s.length(); i++) {
//				if(sb.indexOf(s.charAt(i)+"") ==-1) {
//					sb.append(s.charAt(i));
//				}
//			}
//            String res=sb.toString();
//            char[] ch=res.toCharArray();
//            System.out.println(Arrays.toString(ch));
	}

}

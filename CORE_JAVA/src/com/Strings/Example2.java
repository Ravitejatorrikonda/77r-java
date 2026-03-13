package com.Strings;

public class Example2 {

	public static void main(String[] args) {
		String[] str = { "flower", "flow", "floor", "float", "flex" };

		String shortest = str[0];
		String prefix="";

		for (int i = 0; i < str.length; i++) {
			if (str[i].length() < shortest.length()) {
				shortest = str[i];
			}
		}

		for(int i=0;i<shortest.length();i++) {
			int count=0;
			for(int j=0;j<str.length;j++) {
				if(str[j].charAt(i)==shortest.charAt(i)) {
					count++;
				}
			}
			if(count==str.length) {
				prefix=prefix+shortest.charAt(i);
			}else {
				break;
			}
		}
		System.out.println(prefix);

	}

}

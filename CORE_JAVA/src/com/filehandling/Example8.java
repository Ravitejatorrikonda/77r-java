package com.filehandling;

import java.io.*;

public class Example8 {

	public static void main(String[] args)throws IOException {
		FileReader reader=new FileReader("logo.png");
		
		int i;
	while((i=reader.read()) != -1) {
		System.out.print((char)i);
	}

	
	reader.close();
	}

}

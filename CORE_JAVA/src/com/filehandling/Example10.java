package com.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example10 {

	public static void main(String[] args) throws Exception {
		FileReader reader=new FileReader("Sample1.txt");
		
		
		try (reader;){
			int i;
			while((i = reader.read()) != -1) {
				System.out.print((char)i);
			}
		}

	}

}

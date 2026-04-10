package com.filehandling;

import java.io.*;

public class Example7 {

	public static void main(String[] args)throws IOException {
		FileWriter writer=new FileWriter("Sample1.txt");
		
		writer.write("Java is multithreading");
		writer.write("\n java is synchrnized");
		
		writer.close();
		System.out.println("Filecreated and data added...");
		
		

	}

}

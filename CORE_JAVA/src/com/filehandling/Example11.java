package com.filehandling;

import java.io.*;

public class Example11 {

	public static void main(String[] args) throws Exception {
		FileReader reader=new FileReader("C:\\Users\\ADMIN\\OneDrive\\Pictures\\New folder\\logo.png");
        FileWriter writer=new FileWriter("logoo.png");
        
        int i;
        while((i=reader.read()) != -1) {
//        	System.out.println((char)i);
        	writer.write((char)i);
        }
        System.out.println("Data created");
        
        reader.close();
        writer.close();
	}

}

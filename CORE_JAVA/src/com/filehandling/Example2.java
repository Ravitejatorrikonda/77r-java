package com.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {

	public static void main(String[] args) throws IOException {
		String location="C:\\Users\\ADMIN\\OneDrive\\Desktop\\Desktop\\abc.txt";
		
		FileOutputStream fos=new FileOutputStream(location, true);
		
		String str="\njava is awesome and javascript also";
		
		 byte[] bytes=str.getBytes();	
		fos.write(bytes);
		
		
		
		fos.close();
		System.out.println("Data Created....");
		

	}

}

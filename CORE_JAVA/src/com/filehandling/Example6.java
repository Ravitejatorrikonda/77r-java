package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example6 {

	public static void main(String[] args) throws IOException {
		
		var fis=new FileInputStream("file:///C:/Users/ADMIN/git/repository/CORE_JAVA/logo.png");
		var fos=new FileOutputStream("C:\\Users\\ADMIN\\OneDrive\\Desktop\\hello.txt");
		
		int i;
		while((i=fis.read()) != -1) {
			System.out.println(i);
			fos.write(i);
		}
		
		fis.close();
		
		System.out.println("File readed");
		
	}

}

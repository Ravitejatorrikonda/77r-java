package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example5 {

	public static void main(String[] args) throws IOException {
		String path1="C:\\Users\\ADMIN\\OneDrive\\Desktop\\Desktop\\abc.txt";
		String path2="C:\\Users\\ADMIN\\OneDrive\\Desktop\\Desktop\\efg.txt";
		
		FileInputStream fis=new FileInputStream(path1);
		FileOutputStream fos=new FileOutputStream(path2);
		
		int data;
		while((data=fis.read()) != -1) {
			fos.write(data);
		}
		fis.close();
		fos.close();
		System.out.println("Data addedd...");

	}

}

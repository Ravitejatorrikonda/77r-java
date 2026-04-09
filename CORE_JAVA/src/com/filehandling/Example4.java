package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example4 {

	public static void main(String[] args) throws IOException {
		String location="C:\\Users\\ADMIN\\OneDrive\\Desktop\\Desktop";
		
		File file=new File(location);
		FileInputStream fis=new FileInputStream(file);
		
//		System.out.println((char)fis.read());
		
		int i;
		while((i=fis.read()) != -1) {
			System.out.print((char)i);
		}
		
		
		fis.close();
		
		
		
		
		
		
//		File file=new File(location);
//		
//		if(file.exists()) {
//			System.out.println("File exists...");
//		}else {
//			System.out.println("File not Found....");
//			boolean newFile=file.createNewFile();
//			if(newFile) {
//				System.out.println("File created...");
//			}
//		}

	}

}

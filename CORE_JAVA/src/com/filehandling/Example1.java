package com.filehandling;


import java.io.File;
import java.io.IOException;


public class Example1 {

	public static void main(String[] args) throws IOException {
		String location="C:\\Users\\ADMIN\\OneDrive\\Desktop\\Desktop\\abc.txt";
		
		File file=new File(location);
		
		System.out.println(file.delete()?"Deleted":"! Deleted");
//		
//		if(file.exists()) {
//			System.out.println("File Exisits.....");
//		}else {
//			System.out.println("File Not Found.....");
//			
//			boolean newFile=file.createNewFile();
//			if(newFile) {
//				System.out.println("File created....");
//			}
//			
//		}
		
		

	}

}

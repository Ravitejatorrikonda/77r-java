package com.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class Example3 {

	public static void addTexttotheFile(String location, String data) throws IOException {
		FileOutputStream fos = new FileOutputStream(location);

		fos.write(data.getBytes());

		fos.close();
		System.out.println("data created...");

	}

	public static void main(String[] args) throws IOException {

		String location = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\Desktop\\abc.txt";

		File file = new File(location);

		String data = "class Enum interface records ";

		if (file.exists()) {
			Example3.addTexttotheFile(location, data);
		} else {
			System.out.println("File not found...");
			boolean newFile = file.createNewFile();
			if(newFile) {
//				System.out.println("File created....");
				Example3.addTexttotheFile(location, data);
			}
		}

	}

}

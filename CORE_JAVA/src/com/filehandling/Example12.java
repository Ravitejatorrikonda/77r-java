package com.filehandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable {
	Integer id;
	String name;

	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

public class Example12 {

	public static void main(String[] args) {

		try(FileInputStream fis=new FileInputStream("student_data.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				
				) {
			Student st =(Student) ois.readObject();
			System.out.println(st);
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		
		
		
		//Serialization
//		try (FileOutputStream fis = new FileOutputStream("student_data.txt");
//				ObjectOutputStream oos = new ObjectOutputStream(fis);
//		) {
//			Student st=new Student(100, "sandeep");
//			oos.writeObject(st);
//			System.out.println("File creatded and object inserted");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}

package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Adress implements Serializable {
	String city;
	String street;

	public Adress(String city, String street) {
		super();
		this.city = city;
		this.street = street;
	}

	@Override
	public String toString() {
		return "Adress [city=" + city + ", street=" + street + "]";
	}

}

class Employee implements Serializable {
	transient Adress adress;
	String name;

	public Employee(Adress adress, String name) {
		super();
		this.adress = adress;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [adress=" + adress + ", name=" + name + "]";
	}

}

public class Example13 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("emp.txt"); ObjectInputStream ois = new ObjectInputStream(fis);)

		{
			Employee emp = (Employee) ois.readObject();
			System.out.println(emp);

		} catch (Exception e) {
			e.printStackTrace();
		}

//		try(FileOutputStream fos=new FileOutputStream("emp.txt");
//				ObjectOutputStream oos=new ObjectOutputStream(fos);
//				
//				) {
//			Adress adress=new Adress("HYD", "KPHB");
//			Employee emp=new Employee(adress, "charan");
//			oos.writeObject(emp);
//			System.out.println("Object inserted into file");
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}

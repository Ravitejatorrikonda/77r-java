package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Car implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String engine;
	String tyre;

	public Car(String engine, String tyre) {
		super();
		this.engine = engine;
		this.tyre = tyre;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", tyre=" + tyre + "]";
	}

	
	

}

public class Example14 {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("cars.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);)

		{
			Car car = (Car) ois.readObject();
			System.out.println(car);

		} catch (Exception e) {
			e.printStackTrace();
		}

//		try (FileOutputStream fis=new FileOutputStream("cars.txt");
//				ObjectOutputStream oos=new ObjectOutputStream(fis);
//				){
//			
//			Car car=new Car("Maruthi","MRF");
//			oos.writeObject(car);
//			System.out.println("Object inserted into car file");
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}

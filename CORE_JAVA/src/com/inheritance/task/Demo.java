package com.inheritance.task;


//class Employee{
//	int empId;
//	String empName;
//	public Employee(int empId, String empName) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//	}
//	
//	public void display() {
//		System.out.println("Employee Id"+ this.empId);
//		System.out.println("Employee Name"+ this.empName);
//	}
//
//	
//	public String toString() {
//		return "Employee [empId=" + empId + ", empName=" + empName + "]";
//	}
//	
//}


class AudiCar{
	String color;
	String model;
	String name;
	Engine engine;
	public AudiCar(String color, String model, String name, Engine engine) {
		super();
		this.color = color;
		this.model = model;
		this.name = name;
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "AudiCar [color=" + color + ", model=" + model + ", name=" + name + ", engine=" + engine + "]";
	}
	
	
}
class Engine{
	
	String power;
	String type;
	int fuelCapacity;
	public Engine(String power, String type, int fuelCapacity) {
		super();
		this.power = power;
		this.type = type;
		this.fuelCapacity = fuelCapacity;
	}
	
	
}




public class Demo {
public static void main(String[] args) {
	Engine eng=new Engine("350hp", "diesel", 12);
	AudiCar car=new AudiCar("white", "q","audi" , eng);
	System.out.println(car.engine.power);
}
	
}

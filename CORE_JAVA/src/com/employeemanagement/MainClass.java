package com.employeemanagement;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	int id;
	String name;
	double Salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	
	
	
}

public class MainClass {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		
		boolean result=true;
		
		while(result) {
			System.out.println("1. Add Employee\r\n"
					+ "2. Display All Employees\r\n"
					+ "3. Find Highest Salary Employee\r\n"
					+ "4. Increase Salary by Percentage\r\n"
					+ "5. Exit\r\n"
					+ "");
			
			int choice=sc.nextInt();
			switch (choice) {
			case 1:{
			          System.out.println("Enter Id : ");
			          int id=sc.nextInt();
			          
			          System.out.println("Enter name : ");
			          String name=sc.nextLine();
			          sc.nextLine();
			          
			          System.out.println("Enter Salary : ");
			          double salary=sc.nextDouble();
			          
			          list.add(new Employee(id, name, salary));
			          System.out.println("Employee Details addeedd successfully");
				
				break;
			}

			default:
				break;
			}
		}
		
		
		
		
		sc.close();

	}

}

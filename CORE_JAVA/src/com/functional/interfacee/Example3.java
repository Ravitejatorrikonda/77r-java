package com.functional.interfacee;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Employee {
	private String empName, empDesg;
	private Double empSalary;

	public Employee(String empName, String empDesg, Double empSalary) {
		super();
		this.empName = empName;
		this.empDesg = empDesg;
		this.empSalary = empSalary;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empDesg
	 */
	public String getEmpDesg() {
		return empDesg;
	}

	/**
	 * @param empDesg the empDesg to set
	 */
	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	/**
	 * @return the empSalary
	 */
	public Double getEmpSalary() {
		return empSalary;
	}

	/**
	 * @param empSalary the empSalary to set
	 */
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empDesg=" + empDesg + ", empSalary=" + empSalary + "]";
	}

}

public class Example3 {

	public static void main(String[] args) {
		
		Predicate<Employee> check = new Predicate<Employee>() {
			public boolean test(Employee emp) {
				return emp.getEmpSalary() > 10000;
			}
		};

		Consumer<Employee> consumer = new Consumer<Employee>() {

			@Override
			public void accept(Employee emp) {
				System.out.println(emp);

			}
		};

		Employee emp1 = new Employee("x", "Y", 15000.45);
		Employee emp2 = new Employee("A", "B", 20000.0);
		Employee emp3 = new Employee("x", "Y", 5000.0);

		Employee[] employes = { emp1, emp2, emp3 };

//		for (Employee emp : employes) {
//			if (check.test(emp)) {
//				emp.setEmpSalary(emp.getEmpSalary() + (emp.getEmpSalary() + 0.10));
//
//				consumer.accept(emp);
//			}
//		}
		
		Arrays.stream(employes).filter(check).forEach(System.out::println);

	}

}

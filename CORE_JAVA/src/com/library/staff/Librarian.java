package com.library.staff;

public class Librarian {
	private String librarianName;
	private int yearsofExpereance;
	
	public String getLibrarianName() {
		return librarianName;
	}
	public int getYearsofExpereance() {
		return yearsofExpereance;
	}
	
	public void setLibrarianName(String librarianName) {
		this.librarianName = librarianName;
	}
	public void setYearsofExpereance(int yearsofExpereance) {
		this.yearsofExpereance = yearsofExpereance;
	}
	
	public void showLibrarianInfo() {
		System.out.println("librariyan Name"+librarianName);
		System.out.println("EXP"+yearsofExpereance);
	}
	
	
	

}

package com.library.app;

import com.library.books.Library;
import com.library.staff.Librarian;

public class LibraryApp {

	public static void main(String[] args) {
		Library li1=new Library();
		Librarian li2=new Librarian();
		
		li1.setlibararyName("Gandhi");
		li1.settotalBooks(500);
		System.out.println("=======upsbc==============");
		
		li2.setLibrarianName("Nehru");
		li2.setYearsofExpereance(34);
		
		li1.showLibraryDetails();
		li2.showLibrarianInfo();
		

	}

}

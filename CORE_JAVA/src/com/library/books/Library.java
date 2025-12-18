package com.library.books;

public class Library {
    private String libraryName;
    private int totalBooks;
    
    public String getlibararyname() {
    	return libraryName;
    }
    public int gettotalBooks() {
    	return totalBooks;
    }
    
    public void setlibararyName(String libraryName) {
    	this.libraryName=libraryName;
    }
    public void settotalBooks(int totalBooks) {
              this.totalBooks=totalBooks;
    }
    public void showLibraryDetails() {
    	System.out.println("libraryName : "+libraryName);
    	System.out.println("Total Books : "+totalBooks);
    }
	
	
}

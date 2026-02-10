package com.interfaces.tricky;

public interface Test8 {

	public static void main(String [] args) {
		System.out.println("Hello there");
	}
	
//	public abstract void print();
	
	default void y() {
		x();
	}
	private void x() {
		System.out.println("Hello There");
	}
	
}

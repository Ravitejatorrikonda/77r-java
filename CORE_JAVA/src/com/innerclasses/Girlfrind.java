package com.innerclasses;

public class Girlfrind {
	String name="priya";
	
	class Mood{
		public void angry() {
			System.out.println(name+"says: please go away");
		}
		public void happy() {
			System.out.println(name+"says: lets go to shopping....");
		}
		
	}

	public static void main(String[] args) {
		Girlfrind g=new Girlfrind();
		Mood m= g.new Mood();
		
		m.angry();
		m.happy();

	}

}

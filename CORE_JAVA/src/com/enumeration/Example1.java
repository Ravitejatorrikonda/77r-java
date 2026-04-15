package com.enumeration;

public class Example1 {
	enum Color {
		RED("Stop"), YELLOW("Ready"), GREEN("Start");
		private String message;//

		private Color(String message) {
			this.message = message;
		}

		/**
		 * @return the message
		 */
		public String getMessage() {
			return message;
		}

		/**
		 * @param message the message to set
		 */
		public void setMessage(String message) {
			this.message = message;
		}
		
		

	}

	public static void main(String[] args) {
		Color c = Color.RED;
		
		
//		System.out.println(c.getMessage());
		
		
		for(Color obj:c.values()) {
			System.out.println(obj+" : "+obj.getMessage()+ " : "+obj.ordinal());
		}

//  Color[] a=Color.values();
//  System.out.println(a[0]);
//  System.out.println(a[1]);
//  System.out.println(a[2]);

//		switch (c) {
//		case RED: {
//			System.out.println("Stop");
//			break;
//		}
//		case YELLOW : {
//			System.out.println("Ready to go.....");
//			break;
//		}
//		case GREEN:{
//			System.out.println("Start");
//			break;
//		}
//		default:System.out.println("Invalid color...");
//			break;
//		}
		
//		if(c==Color.YELLOW) {
//			System.out.println("READY  to GO..");
//		}else if(c==Color.RED) {
//			
//		}

	}

}

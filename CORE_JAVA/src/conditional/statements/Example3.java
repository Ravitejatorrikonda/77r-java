package conditional.statements;

public class Example3 {
	
	public void simpleIf(int a, int b) {
		if(a>b) {
			System.out.println("A is Big");
		}
		if(b>a) {
			System.out.println("B is Big");
			
		}
		if(a==b) {
			System.out.println("Both are equal");
		}
	}
	
	public void ladderIf(int a, int b) {
		if(a>b) {
			System.out.println("A is Big");
		}else if(b>a) {
			System.out.println("B is Big");
		}
		else {
			System.out.println("Both are equal");
		}
	}
	public void checkGender(String gender) {
		if(gender == "Male") {
			System.out.println("Gender is Male");
		}else if(gender=="Female") {
			System.out.println("Gnder is Female");
		}
		else if(gender == "Others") {
			System.out.println("Others");
		}else {
			System.out.println("Not a Valid Gender");
		}
	}
	
	//                              10    20             +
	public void basedOnOpereator(int a, int b, String operator) {
		if(operator== "+") {
			System.out.println(a+b);
		}
		else if(operator == "-") {
			System.out.println(a-b);
		}
		else if(operator == "*") {
			System.out.println(a*b);
		}
		else if(operator == "/") {
			if(b==0) {
				System.out.println("cant be divisable");
			}else {
				System.out.println(a/b);
			}
		}
		else if(operator == "%") {
			System.out.println(a%b);
		}
		else {
			System.out.println("Not a Valid Operator");
		}
	}
	
	
	
	public String getGrade(int marks) {
		String st;
		
		if(marks <= 100 && marks >=90) {
			st="Grade A";
		}
		else if(marks < 90 && marks >= 80) {
			st="Grade B";
		}else if(marks < 80 && marks >= 60) {
			st="Grade C";
		}else if(marks < 60 && marks >= 45) {
			st="Grade D";
		}else if(marks < 45 && marks >= 0) {
			st="Fail";
		}
		else {
			st="invalid marks";
		}
		return st;	
	}
	
	
	

	public static void main(String[] args) {
		new Example3().simpleIf(20, 10);
		new Example3().ladderIf(30, 40);
		new Example3().checkGender("jbssdbfkfjh");
		
		new Example3().basedOnOpereator(20, 10, "%");
		String result =new Example3().getGrade(444);
		System.out.println(result);
		
		
		/**
		 *  write a java program on calculations for two numbers based on operator
		 *  method name BasedOnOperator(int a, int b, String operator)
		 *  +, -, *, %, /
		 *  if(operator == "+"){syso(a+b)}
		 * 
		 * 
		 * 
		 * write a java program to find the grade of a student
		 * getGrade(int marks)
		 * marks 100 and 90 grade A   if(marks <= 100 && marks >= 90)
		 * marks 90 and 80 grade B   els eif (marks < 90)
		 * marks 80 and 60 grade c
		 * marks 60 and 45 grade d
		 * marks 45 and 0 grade F
		 * marks has invalid and neg numbers invalid marks
		 * 
		 */
		
		
		
		
		
		
		

	}

}

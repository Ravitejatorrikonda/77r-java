package conditional.statements;

public class Demo {
	
	
	public static String printdata(int a, int b, int c) {
		//   t         t 
		if((a>b) && (a>c)) {
			return "A is Big";
		}
		
		if((b>a)&&(b>c)) {
			return "B is big";
		}
		if(!(c>a)&&(c>b)) {
			return "C is big";
		}
		if((a==b) && (b==c)) {
			return "A and B and C are equal";
		}
		return "not a valid numbers";
		
	}

	public static void main(String[] args) {
	Demo obj=new Demo();
	       String result=Demo.printdata(10, 10, 20);
	       System.out.println(result);

	}

}

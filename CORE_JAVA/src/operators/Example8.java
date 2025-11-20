package operators;

public class Example8 {
	
	int a;
	public  void printdata(Example8 obj) {
		obj.a=obj.a++ + ++obj.a;
		
	}
	

	public static void main(String[] args) {
		Example8 obj1=new Example8();
		obj1.a=10;
		obj1.printdata(obj1);
		System.out.println(obj1.a);
		

	}

}

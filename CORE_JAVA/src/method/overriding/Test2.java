package method.overriding;

class X{
	public String getDatainUppercase(String str) {
		return str.toUpperCase();
	}
	
	
}
class Y extends X{
	
	public int getDatainUppercase(Object str) {
		return 10;
	}

}



public class Test2 {
	

	public static void main(String[] args) {
	X x=new Y();
	String result=x.getDatainUppercase("Heloo There");
	System.out.println(result);
//	x.getData();

	}

}

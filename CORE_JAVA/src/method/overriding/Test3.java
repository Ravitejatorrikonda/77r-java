package method.overriding;


class Parent{
	private void getData(int a) {
		System.out.println(a);
	}
}
class Child extends Parent{
	
	 private void getData(int a) {
		System.out.println(a);
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

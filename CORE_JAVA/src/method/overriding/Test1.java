package method.overriding;

class A{
	public void sleeping() {
		System.out.println("parent is sleeping in 11 pm");
	}
	public void eating() {
		System.out.println("parent is eating edly");
	}
}
class B extends A{
	public void sleeping() {
		
		System.out.println("child is sleeping in 1 am");
	}
	public void eating() {
		System.out.println(" child is eating fastfood");
	}
	public void palyOnlineGames() {
		System.out.println("games");
	}
}



public class Test1 {

	public static void main(String[] args) {
		
		A a1=new B();
		a1.sleeping();
		a1.eating();
//		a1.palyOnlineGames();
		
		System.out.println("-----------------");
		
		
		/**
		 * at the time of compilation
		 * at the time of compiler while checking the methods peresent the parent or not
		 * 
		 * if in case method is not presenting in the parent class it will throw the CE
		 * if in case method is presenting in parent class , the responsibulity
		 *  of methods will take care by the interpreter
		 * 
		 * interprter first check the which object i am going to create, 
		 * then i am going to call the same class method
		 * this is why method overriding is known as runtime polymorphism
		 * 
		 */
		
		
		A a=new A();
		
		a.sleeping();
		a.eating();
		System.out.println("------------------");
		
		B b=new B();
		b.sleeping();
		b.eating();
           
	}

}

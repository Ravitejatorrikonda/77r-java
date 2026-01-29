package com.method.overriding;

class Xparent{
	public Object getNumber() {
		return 34;
	}
}
class Ychild extends Xparent{
	@Override
	public Integer getNumber() {
		return 100;
	}
}
class Zchild extends Xparent{
//	public Short getNumber() {
//		return 43;
//	}
}


public class Test2 {

	public static void main(String[] args) {
	      Xparent x=new Zchild();
//	    Integer num=(Integer)x.getNumber();
//	    System.out.println(x.getNumber());
	       Short s1=(Short)x.getNumber();
	       System.out.println(s1);
	    
	    
	    

	}

}

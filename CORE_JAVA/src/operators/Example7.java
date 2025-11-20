package operators;

public class Example7 {

	public static void main(String[] args) {
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("-----------------");
		System.out.println(10 >= 30 && 10 <= 30);
		
		int a=1;
		System.out.println(false && ++a == 2);//false
		System.out.println(a);
		
		a=3;
		System.out.println(true && ++a == a++);//true
		System.out.println(a);
		System.out.println("***********************");
		
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
//		System.out.println(true == true || false != false);
		System.out.println(true && false && false); 
		System.out.println((true || true) && false); 
		System.out.println(true || false || false); 
		
//		int x=30;
//		 //                 false    31   == 32  &&  32  ==   34                 
//		System.out.println((false || ++x == x++) && (x++ == ++x));//false
//		System.out.println(x);
		Example7 obj1=new Example7();
		Example7 obj2=new Example7();
		System.out.println(obj1 == obj2 && "hello" == "hello");
		int y=4;
		//                      true       &&  false        ||     false
		//                   4   == 12             8            7  ==   8
		System.out.println(!(y++ == ++y+y) && (y++ == ++y) || (--y == ++y));//false
		System.out.println(y);//8
		
		
//		byte r=5;
//		byte s=3;
//		System.out.println(r & s);
//		
//		byte c=13;
//		byte d=5;
//		System.out.println(c & d);//5	
//		
//		int e=4;
//	   System.out.println(e & ++e);
//		
////	   int f=5;  //f=f+1=
////      System.out.println(~f);
////      f=-6;
////      System.out.println(~f);
//		
////		System.out.println(12 << 2);      //2*n*num
//		
//		
//	
//		System.out.println(16 >> 2);    //num/2*n    16/2*2
		
		System.out.println(5 | 3);
		
		
		
		
		

	}

}

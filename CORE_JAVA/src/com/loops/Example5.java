package com.loops;

public class Example5 {
	//                       1        3
	public int getPower(int base, int exp) {
		
		//To find the power of a number
		int power=1;//1
		for(int i=1; i<= exp; i++) {
			power=power*base;
		}        // 25 * 5
		return power;//125
	}
		//To find the count of a number
		//                              0
		public int getPowerofNumber(int num) {
			int count=0;
			while(num !=0) {
				count++;
				num /=10;
			}
			return count;
		}
		//                         1
		public boolean isAmstrong(int num) {
			int count=getPowerofNumber(num);//3
			int temp=num;
			int sum=0;//153
			while(num !=0) {
				int rem=num%10;//1
				sum=sum+getPower(rem, count);
				//   152+1
				num /=10;
			}
			return temp==sum;
		}
		
		
		
		
	
	
	
	

	public static void main(String[] args) {
		
//		boolean result=new Example5().isAmstrong(153);
//		System.out.println(result? "amstrong": "Not a Amstrong");
		
		for(int i=1; i<=10000;i++) {
			boolean result=new Example5().isAmstrong(i);
			if(result) {
				System.out.println(i);
			}
		}
	
	}

}

package com.Intv;

public class SwapNum {

	public static void main(String[] args) {
		
		int a = 10 , b = 20;
		// Solution 1
//		int c = a+b;
//		b = c - b;
//		a = c -b;
//		System.out.println("Value of a :"+a +"Value of b "+b);
		// Solution 2
//		a = a+b;
//		b = a - b;
//		a = a - b;
//		System.out.println("Value of a :"+a +"Value of b "+b);
//		
//		a = a * b;
//		b = a / b;
//		a = a / b;
//		System.out.println("value of a  :"+ a +" and value of b is" + b);
//		// solution 4		
//		a = a^b;
//		b = a^b;
//		a = a^b;
		//System.out.println(a+" and "+b);
		//solution 5
		b = a+b -(a=b);
		System.out.println(a+" and "+b);
				
				

	}

}

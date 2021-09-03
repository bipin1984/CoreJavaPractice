package com.faq;

public class Fibo {

	public static void main(String[] args) {
		
		int n = 20;
		int a = 0 ;
		int b = 1;
		int count = 1;
		System.out.print(a + "," + b);
		while(count<n-1)
		{
			int c = a+b;
			a = b;
			b = c ;
			System.out.print("," + c);
			count++;
		}
		

	}

}

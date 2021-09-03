package com.faq;

public class Fact {
	
	int factorial(int n)
	{
		return (n==1 || n ==0) ? 1 : n * factorial(n-1);
	}

	public static void main(String[] args) {
		
		Fact f = new Fact();
		int num=6;
		f.factorial(num);
		System.out.println("Factorial of " + num  + " is " + f.factorial(num));
	}

}

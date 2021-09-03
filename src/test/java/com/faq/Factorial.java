package com.faq;

public class Factorial {

	static int factirial(int num)
	{
		if(num==0)
		{
			return 1;
			
		}else
		{
			return num * factirial(num-1);
		}
	}
	
	public static void main(String[] args) {
		int num = 6;
		int fact = 1; 
		for(int i=num;i>0;i--)
		{
			fact = fact*i;
		}

		System.out.println(fact);
		
		System.out.println("Factorial of number "+factirial(num));
	}

}

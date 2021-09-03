package com.faq;

public class PalindrumNumber {

	public static void main(String[] args) {
		
		int num = 10101;
		int sum = 0;
		int temp = num;
		int rem;
		
		while(num>0)
		{
			rem = num % 10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		
		if(temp==sum)
		{
			System.out.println(temp+" is palindrum");
		}else
		{
			System.out.println(temp+" is not palindrum");
		}
		

	}

}

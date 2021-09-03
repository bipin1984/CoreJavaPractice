package com.faq;

public class ListOfPrimes {

	public static void main(String[] args) {
		
		for(int i = 2;i<101;i++)
		{
			int temp = 0;
			for(int k = 2;k<=i/2;k++)
			{
				if(i%k == 0)
				{
					temp = temp + 1;
					break;
					
				}
				
				
			}
			
			if(temp==0)
			{
				System.out.println(i + " is prime ");
			}
		}

	}

}

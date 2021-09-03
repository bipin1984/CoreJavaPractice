package com.faq;

public class Amstrong {

	public static void main(String[] args) {
		
		int num = 153;
		int rem = 0;
		int temp = 0;
		int sum = 0;
		temp = num;
		while(num>0)
		{
			rem = num%10;
			sum = sum + (rem*rem*rem);
			num = num / 10;
			
		}
		
		if(temp==sum)
		{
			System.out.println("is amstrong");
		}else
		{
			System.out.println("not an amstrong");
		}
	}

}

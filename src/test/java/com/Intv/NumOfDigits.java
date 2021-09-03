package com.Intv;

public class NumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 3454657;
		int count = 0;
		while(num>0)
		{
			num = num /10;
			count= count + 1;
			
		}
		System.out.println("number of digits in the no is :"+count);

	}

}

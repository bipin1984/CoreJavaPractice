package com.faq;

public class ReverseAnArray {

	public static void main(String[] args) {
		int num[] =  {3,5,12,45,67};
		int num1[] = new int[num.length];
		int j = num.length-1;
		for(int i = 0 ;i< num.length;i++)
		{
			num1[i] = num[j];
			j--;
		}
		
		
		for(int k=0;k<num1.length;k++)
		{
			System.out.println(num1[k]);
		}
		
	}

}

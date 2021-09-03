package com.faq;

public class CopyArrayToAaray {

	public static void main(String[] args) {
		
		int num[] =  {3,5,12,45,67};
		int num1[] = new int[num.length];
		for(int i=0;i<num.length;i++)
		{
			num1[i] = num[i];
		}
		
		for(Integer k : num1)
		{
			System.out.print(k + " ");
		}

	}

}

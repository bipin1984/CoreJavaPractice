package com.faq;

public class BubbleSort {

	public static void main(String[] args) {
		int num[] = {12,45,6,97,8,67};
		int len = num.length;
		int largest = 0;
		for(int i=0;i<len;i++)
		{
			
			for(int j=i+1;j<len;j++)
			{
				if(num[i]>num[j])
				{
					largest = num[i];
					num[i] = num[j];
					num[j] = largest;
					
				}
			}
		
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.println(num[i]);
		}

	}

}

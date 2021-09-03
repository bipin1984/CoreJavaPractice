package com.Intv;

public class MaxvalArr {

	public static void main(String[] args) {

		int a[] = {10,50,34,7,90,28};
//		int max = a[0];
//		
//		
//		for(int i = 0; i <=a.length-1;i++)
//		{
//			if(a[i]>=max)
//			{
//				max = a[i];
//				
//			}
//			
//		}
		
		int min = a[0];
		for(int i = 0; i <=a.length-1;i++)
			{
				if(a[i]<=min)
				{
					min = a[i];
					
				}
				
			}
		System.out.println("The max number is :"+min);
		

	}

}

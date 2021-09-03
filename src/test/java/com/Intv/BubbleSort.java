package com.Intv;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = {67,34,12,87,54,23};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j]= temp; 
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}

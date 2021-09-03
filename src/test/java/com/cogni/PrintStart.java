package com.cogni;

public class PrintStart {

	public static void main(String[] args) {
		int n = 6;
		for(int i =0;i<n;i++)
		{
			
			for(int j=n-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		for(int i =0;i<n;i++)
		{
			
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(j +" ");
			}
			
			System.out.println();
		}

	}

}

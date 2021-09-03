package com.cogni;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter 1st range");
		int lowerbound = sc.nextInt();
		System.out.println(" Enter 2nd range");
		int upperbound = sc.nextInt();
		System.out.printf("Prime Numbers between %d and %d are :",lowerbound,upperbound);
		for(int i = lowerbound; i <= upperbound ; i++ )
		{
			int count = 0;
			for( int j = 2; j<=i/2 ; j++)
			{
				if(i%j == 0)
				{
					count = 1;
					break;
				}
			}
			
			if(count==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}

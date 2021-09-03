package com.cogni;

import java.util.Scanner;

public class Fibo {

	public static class Fibbonaci
	{
		public static void checkFibo(int n)
		{
			int i =0,j=1,k=0;
			System.out.println("Fibo Series upto "+n +" is" );
			int l =0;
			while(l<=n)
			{
				System.out.println(i);
				k = i + j;
				i = j;
				j = k;
				l++;
						
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Fibbonaci.checkFibo(sc.nextInt());

	}

}

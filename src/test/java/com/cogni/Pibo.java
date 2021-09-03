package com.cogni;

import java.util.Scanner;

public class Pibo {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		System.out.println(" Enter Range :");
		int x = sc.nextInt();
		
		int a = 0;
		int b = 1;
		System.out.print(a);
		while(a < x)
		{
			
			
			int c = a + b;
			a = b;
			b = c;
			System.out.print(a + " ");
			
			
			
			
		}

	}

}

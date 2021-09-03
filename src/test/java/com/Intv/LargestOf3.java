package com.Intv;

import java.util.Scanner;

public class LargestOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub20
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First numbers :");
		int a = sc.nextInt();
		System.out.println("Enter Second numbers :");
		int b = sc.nextInt();
		System.out.println("Enter Third numbers :");
		int c = sc.nextInt();
		int largest = a;
		if(a>b && a > c)
		{
			System.out.println(a+":is largest");
		}
		else if(b>a && b > c)
		{
			System.out.println(b+": is largest");
		}
		else
		{
			System.out.println(c+" : is largest");
		}
	}

}

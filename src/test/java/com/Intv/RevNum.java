package com.Intv;

import java.util.Scanner;

public class RevNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int number = sc.nextInt();
		// Solution 1
		
//		int rev_num = 0;
//		while(number!=0)
//		{
//			int p = number % 10;
//			rev_num = rev_num *10 + p;
//			number = number /10;
//		}
//		System.out.println(rev_num);
		
		// Solution 2
		StringBuffer sb = new StringBuffer(String.valueOf(number));
		System.out.println(sb.reverse());
		
		//Solution 3  StringBuilder
		
		StringBuilder sbi = new StringBuilder();
		System.out.println(sbi);
		sbi.append(number);
		System.out.println(sbi.reverse());
		
	}

}

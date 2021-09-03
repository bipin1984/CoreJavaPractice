package com.Intv;

public class NumDigits {

	public static void main(String[] args) {
		
		int num = 237565;
		
		int count = 0;
//		while(num!=0)
//		{
//			int p = num % 10 ;
//			count+=1;
//			num = num /10;
//			
//		}
//		System.out.println("Count of digits = "+count);
		String str = Integer.toString(num);
		System.out.println(str.length());
		//StringBuffer sb = new StringBuffer(String.valueOf(num));
		//System.out.println(sb.length());
		
	}

}

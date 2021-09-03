package com.faq;

import java.util.ArrayList;

public class ReverseOfString {

	public static void main(String[] args) {
		
		String name = "Bipin Bihari Behera";
		String str[] = name.split(" ");
		int len = str.length;
		
		String newStr = "";
		for(int j=0;j<len;j++)
		{
			String str1 = str[j];
			String rev = "";
			for(int i=str1.length()-1;i>=0;i--)
			{
				rev = rev + str1.charAt(i);
			}
			newStr = newStr + rev + " ";
		}
		
		System.out.println(newStr);
	
		ArrayList<String> al = new ArrayList<String>();
		
	}

}

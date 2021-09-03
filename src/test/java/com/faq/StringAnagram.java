package com.faq;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String name1 ="Grab";
		name1 = name1.toLowerCase();
		String name2 = "Brkg";
		name2 = name2.toLowerCase();
		if(name1.length()!=name2.length())
		{
			System.out.println("Strings are not anagram");
		}else
		{
			
			char str1[] = name1.toCharArray();
			char str2[] = name2.toCharArray();
			Arrays.sort(str1);
			Arrays.sort(str2);
			if(Arrays.equals(str1,str2)==true)
			{
				System.out.println("Strings are anagram");
			}else
			{
				System.out.println("Strings are not anagram");
			}
		}
		
	}

}

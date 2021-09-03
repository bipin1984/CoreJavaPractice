package com.faq;

public class TotalVowel {

	public static void main(String[] args) {
		
		String str = "this is indian subcontinent";
	 
		int len = str.length();
		int vowelCount = 0;
		for(int i =0;i<len;i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)== 'e'|| str.charAt(i)== 'i'|| str.charAt(i)== 'o'||str.charAt(i)=='u')
			{
				
				vowelCount++;
				System.out.println(str.charAt(i) + ": "+vowelCount);
			}
		}
		System.out.println(vowelCount);
	}

}

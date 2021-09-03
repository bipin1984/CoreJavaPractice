package com.faq;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String str = "This is a simple string";
		String strs[] = str.split(" ");
		String finalStr = "";
		for(int i=0;i<strs.length;i++)
		{
			String tempStr = strs[i];
			String newStr = "";
			char chrs[] = tempStr.toCharArray();
			for(int j=chrs.length-1;j>=0;j--)
			{
				newStr = newStr+ chrs[j];
			}
			
			finalStr = finalStr + newStr + " ";
			
			
		}
		System.out.println(finalStr);

	}

}

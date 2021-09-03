package com.faq;

public class StringPalindrum {

	public static void main(String[] args) {
		
		String str = "malayalam1223";
		StringBuffer sb = new StringBuffer(str);
		String reverese = sb.reverse().toString();
		
		if(str.equals(reverese))
		{
			System.out.println("String is Palindrum");
		}else
		{
			System.out.println("String is not Palindrum");
		}
		

	}

}

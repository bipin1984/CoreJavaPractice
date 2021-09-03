package com.faq;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str = "This,     is   a       simple   string";
		
		String strs[] = str.split(" ");
//		String newStr = "";
//		for(int i=0;i<strs.length;i++)
//		{
//			newStr = newStr + strs[i];
//		}
//		System.out.println(newStr);

		str = str.replaceAll("\\s+", "");
		System.out.println(str);
		
	}

}

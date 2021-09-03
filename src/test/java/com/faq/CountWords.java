package com.faq;

public class CountWords {

	public static void main(String[] args) {
		String str = "This is a simple string";
		String arays[] = str.split(" ");
		int count = 0;
		
		for(int i=0;i< arays.length;i++)
		{
			count++;
			
		}
		
		int sum =1;
		for(int j=0;j<str.length()-1;j++)
		{
		
			if(str.charAt(j)==' ' && str.charAt(j+1)!=' ')
			{
				sum++;
			}
	
			
		}
		
		System.out.println("Total words :"+count);
		System.out.println("Total words  :"+arays.length);
		System.out.println("Total words  :"+sum);
	}

}

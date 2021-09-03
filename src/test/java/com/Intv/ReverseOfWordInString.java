package com.Intv;

public class ReverseOfWordInString {

	public static void main(String[] args) {
		
		
		String str = "WELCOME TO JAVA";
		String str1[] = str.split(" ");
		String rev_str = " ";
		char s = 'A';
		int occurance = 0;
		int count = 0;
		for(int i=0;i<str1.length;i++)
		{
			//System.out.print(" ");
			char word[] = str1[i].toCharArray();
			for(int j=word.length-1;j>=0;j--)
			{
				if(word[j]==s)
				{
					occurance = occurance + 1;
				}
				rev_str = rev_str + word[j];
			}
			
			rev_str = rev_str + " ";
			count = count + 1;
		}
		System.out.print(rev_str);
		System.out.println();
		System.out.println(count);
		System.out.println(occurance);
		

	}

}

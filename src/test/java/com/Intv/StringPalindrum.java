package com.Intv;

public class StringPalindrum {

	public static void main(String[] args) {

		String name="malayalam";
		String rev_name="";
		char a[] = name.toCharArray();
		System.out.println(a);
		System.out.println(a.length);
		for(int i=a.length-1; i>=0;i--)
		{
			System.out.println(a[i]);
			rev_name = rev_name+a[i];			
		}
		System.out.println(rev_name.length());
		if(rev_name.equals(name))
		{
			System.out.println(name +" is a palindrum ");
		}
		else
		{
			System.out.println("name is not a palindrum");
		}

	}

}

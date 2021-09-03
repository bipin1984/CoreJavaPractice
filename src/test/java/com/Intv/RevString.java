/* This program print the reverse of the string in
 * three different ways
 * Method 1:
 * 1. loop reversely and extract element from end 
 * 2. add the element to blank string
 * Method 2:
 * 1. convert the String to char array
 * 2. extract the elements from end 
 * 3. add the element to the blank string 
 * 
 * Method 3: 
 * Using String Buffer class
 */

package com.Intv;

public class RevString {

	public static void main(String[] args) {
	 // Solution Type 1:
		String name = "Bharat";
		String rev_name = "";
		
		for(int i = name.length()-1; i>=0 ;i--)
		{
			rev_name = rev_name + name.charAt(i);
		
		}
		System.out.println(rev_name);
	//Solution Type 2	
		char Str[] = name.toCharArray();
		int len = Str.length;
		for(int i = len-1;i>=0;i--)
		{
			rev_name = rev_name + Str[i];
		}
		System.out.println(rev_name);
	// Solution Type 3	
		StringBuffer stbuffer = new StringBuffer(name);
		System.out.println(stbuffer.reverse());
		
		
	}

}

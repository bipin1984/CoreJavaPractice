package com.faq;

public class NoneDuplicateChars {

	public static void main(String[] args) {
		
		String name ="Bipin Behera";
		String nameLower = name.toLowerCase();
		char name_char_arr[] = nameLower.toCharArray();
		
		int count = 0;
		for(int i=0;i<name_char_arr.length;i++)
		{
			count = 1;
			for(int j =i+1;j<name_char_arr.length;j++)
			{
				
				if(name_char_arr[i] == name_char_arr[j] && name_char_arr[j]!='0')
				{
					count++;
					name_char_arr[j] = '0';
					
				}
			}
			if(count == 1 && name_char_arr[i]!='0' && name_char_arr[i]!=' ')
			{
				System.out.println(name_char_arr[i]);
				
			}
			
		}
		
		

	}

}

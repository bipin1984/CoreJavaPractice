package com.faq;

public class NumberOfTimesWordFound {

	public static void main(String[] args) {
		
		String str = "my name is bipin behera, bipin  behera is a good name";
		String str1[] = str.split(" ");
	
		int len = str1.length;
		int count = 0;
		
		for(int i=0;i<len;i++)
		{
			count = 1;
			String str2 = str1[i].replaceAll("[-+.^:,]","");
			for(int j=i+1;j<len;j++)
			{
				
				if(str2.equalsIgnoreCase(str1[j]) && str1[j]!="0")
				{
					count++;
					str1[j] = "0";
				}
			}
			if(str1[i]!="0")
			{
			System.out.println(str2 + ":" + count);}
		}
		
		

	}

}

package com.faq;

public class DulicateElementInArray {

	public static void main(String[] args) {
		int num[] =  {3,5,12,3,45,67,12,3};
		int count = 0;
		for(int i=0;i<num.length;i++)
		{
			count = 1;
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j] && num[j]!=0)
				{
					count ++;
					num[j]=0;
				}
			}
			
			if(count>1)
			{
				System.out.println(num[i]);
			}
		}

	}

}

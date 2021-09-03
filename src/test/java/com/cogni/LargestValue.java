package com.cogni;

import java.util.Arrays;
import java.util.List;

public class LargestValue {

	public static void main(String[] args) {
		
		int data[] = {10,4,20,5,34,98,12,19};
		int big = data[0];
		for(int i=0;i<data.length;i++)
		{
			if(data[i]> big)
			{
				big = data[i];
			}
		}
		
		System.out.println("Greatest Number Is :"+big);
	}

}

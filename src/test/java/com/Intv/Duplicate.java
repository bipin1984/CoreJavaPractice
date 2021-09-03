package com.Intv;

import java.util.HashSet;

public class Duplicate {

	public static void main(String[] args) {
		// Solution 1:
		
		String name[] = {"Bipin","Suman","Pranati","Umesh","Devansh","Gita"};
		boolean flag = false;
		/*
		for(int i=0;i<name.length;i++)
		{
			for(int j=i+1;j<name.length;j++)
			{
				if(name[i]==name[j])
				{
					System.out.println("Duplicate Element Found");
					flag = true;
				}
			}
		 	
		}
		if(flag==false)
		{
			System.out.println("Duplicate Element Not Found");
		}*/
		
		HashSet hs = new HashSet();
		for(String nm:name)
		{
			if(hs.add(nm)==false)
				{
					System.out.println("Duplicate Found");
					flag = true;
				}
		}
		
		if(flag==false)
		{
			System.out.println("Duplicate not found!");
		}
		
	}

}

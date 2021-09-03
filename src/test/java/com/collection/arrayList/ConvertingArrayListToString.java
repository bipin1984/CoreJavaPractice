package com.collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertingArrayListToString {
	
	public static String[] ArrayListToString(ArrayList<String> list)
	{
		String array[] = new String[list.size()];
		for(int i=0;i<list.size();i++)
		{
			array[i] = list.get(i);
		}
		
		return array;
		
	}
	
	

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Bipin");
		arrayList.add("Umesh");
		arrayList.add("Gita");
		arrayList.add("Pinki");
		arrayList.add("Suman");
		arrayList.add("Babu");
		
		String arr[] = ArrayListToString(arrayList);
		for(String str: arr)
		{
			System.out.println(str);
		}
		System.out.println(Arrays.toString(arr));

	}

}

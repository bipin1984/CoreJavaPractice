package com.faq;

import java.util.ArrayList;

public class ArratListToStringArray {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Bipin");
		al.add("Pinki");
		al.add("Mamun");
		al.add("Babu");
		al.add("Gita");
		al.add("Umesh");
		
		String arrs[] = new String[al.size()];
		System.out.println(al);
		for(int i=0; i<al.size();i++)
		{
			arrs[i] = (String) al.get(i);
		}

		for(String s: arrs)
		{
			System.out.println(s);
		}
		//al.forEach(data->System.out.println(data));
		
		
		String[] arr2 = al.toArray(new String[al.size()]);
		for(String s1:arr2)
		{
			System.out.println(s1);
		}
	}

}

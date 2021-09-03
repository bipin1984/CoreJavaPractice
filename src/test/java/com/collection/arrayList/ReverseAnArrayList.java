package com.collection.arrayList;

import java.util.ArrayList;

public class ReverseAnArrayList {
	
	public static ArrayList reverseArrayList(ArrayList list)
	{
		ArrayList newList = new ArrayList();
		
		for(int k=list.size()-1;k>=0;k--)
		{
			newList.add(list.get(k));
		}
		
		return newList;
		
	}
	
	public static void showList(ArrayList alist)
	{
		for(int i=0;i<alist.size();i++)
		{
			System.out.println(alist.get(i));
		}
	}

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		
		arr.add("Umesh");
		arr.add("Bipin");
		arr.add("Pinki");
		arr.add("Gita");
		arr.add("Mamun");
		arr.add("Babu");
		
		ArrayList arryList = reverseArrayList(arr);
		showList(arryList);

	}

}

package com.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToSubList {

	public static void main(String[] args) {
		
		try
		{
			
	
		ArrayList arrlist = new ArrayList();
	    arrlist.add("Bipin");
        arrlist.add("Babu");
        arrlist.add("Pinki");
        arrlist.add("Suman");
        arrlist.add("Umesh");
        arrlist.add("Gita");
        
        System.out.println(arrlist);
        List<String> arrList1 = arrlist.subList(7,4);
        System.out.println(arrList1);
        
		}catch(IndexOutOfBoundsException e)
		{
			System.out.println("Thorw Exception" +e);
		}catch(IllegalArgumentException exe)
		{
			System.out.println("Thorw IllegalArgument Exception" +exe);
		}
	}

}

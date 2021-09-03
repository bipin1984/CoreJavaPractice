package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrListAddAll {

	public static void main(String[] args) {
	
		ArrayList ar = new ArrayList();
		
		ar.add("Y");
		ar.add("K");
		ar.add("P");
		ar.add("M");
		ar.add("E");
		ar.add("T");
		ar.add(4, "Z");
	//	ar.add(3);
		System.out.println(ar);
		ArrayList ar1 = new ArrayList();
		//System.out.println(ar1.addAll(ar));
		//System.out.println(ar1);
		ar1.addAll((ar));
		//System.out.println(ar1);
		Collections.sort(ar);
		System.out.println(ar);
		Collections.sort(ar,Collections.reverseOrder());
		System.out.println(ar);
		Collections.shuffle(ar);
		System.out.println(ar);
	
		String array[] = {"Bipin","Suman","Pinki"};
//		for(String str:array)
//		{
//			System.out.println(str);
//		}
		ArrayList al = new ArrayList(Arrays.asList(array));
		//System.out.println(al);
		for(Object s:al)
		{
			System.out.println(s);
		}
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
//		System.out.println(ar.get(4));
//		System.out.println(ar.contains("G"));
//		System.out.println(ar.isEmpty());
		
	}

}

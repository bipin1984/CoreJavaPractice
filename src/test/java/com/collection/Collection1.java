package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {
		// Declare ArrayList Object
		
		ArrayList<Integer> arl = new ArrayList<Integer>();
		arl.add(10);
		List arl1 = new ArrayList();
		arl1.add("Bipin");
		arl1.add("Behera");
		arl1.add("Barang");
		arl1.add("Odisha");
		arl1.add(30);
		arl1.add(30.45);
		arl1.add(true);
		System.out.println(arl1.size());
		System.out.println(arl1);
		System.out.println(arl);
		System.out.println("*************Remove Element****************");
		arl1.remove(new Integer(30));
		arl1.remove(3);
		System.out.println("**********Add After Remove*************");
		arl1.add(1, "Bihari");
		arl1.add(4, "Cuttack");
		System.out.println("**********Final List*************");
		System.out.println(arl1);
		System.out.println(arl1.get(4));
		arl1.set(3,"BBSR");
		System.out.println(arl1);
		System.out.println(arl1.contains("Behera"));
		System.out.println(arl.isEmpty());
//		for(int i = 0 ; i <arl1.size();i++)
//		{
//			System.out.println(arl1.get(i));
//		}
//		
//		for(Object arl2:arl1)
//		{
//			System.out.println(arl2);
//		}
		
		Iterator irt = arl1.iterator();
		while(irt.hasNext())
		{
			System.out.println(irt.next());
		}
			
	}
}

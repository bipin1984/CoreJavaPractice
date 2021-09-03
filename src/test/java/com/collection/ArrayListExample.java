package com.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

	public static void main(String[] args) {
		
		// Add an array of data to an arraylist
		
		String ary[] = {"bipin","suman","pinki"};
		ArrayList al = new ArrayList(Arrays.asList(ary));
		//al.addAll(2, al);
		System.out.println(al);
		
		
		al.add("Dadhapatana");
		al.add("Barang");
		al.add("Cuttack");
		
		System.out.println(al);
		
		al.add(3,"Dadha");
		System.out.println(al);
		al.set(2,"Adarsh Nagar");
		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		al2.addAll(0,al);
		System.out.println(al2);
//		for(Object str:al2)
//		{
//			System.out.println(str);
//		}
//		
//		for(int i=0;i<al2.size();i++)
//		{
//			System.out.println(al.get(i));
//		}
//		
		al.forEach(k->
		{
			k = "1 :" + k;
			System.out.println(k);
		});
	}

}

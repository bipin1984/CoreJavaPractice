package com.collection.hashsets;

import java.util.HashSet;
import java.util.Random;

public class GenerateRandom {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(76);
		hs.add(73);
		hs.add(84);
		hs.add(65);
		hs.add(93);
		hs.add(77);
		hs.forEach(k-> System.out.println(k));
		Integer[] arraysNumber = hs.toArray(new Integer[hs.size()]);
		for(int i=0;i<arraysNumber.length;i++)
		{
			System.out.println(arraysNumber[i]);
		}
		
		
		Random rnd = new Random();
		int randNumber = rnd.nextInt(hs.size());
		System.out.println("Random Element :"+arraysNumber[randNumber]);
	}

}

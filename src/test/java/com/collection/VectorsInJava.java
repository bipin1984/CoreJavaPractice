package com.collection;

import java.util.Vector;

public class VectorsInJava {

	public static void main(String[] args) {
		int n = 10;
		
		Vector<Integer> vector = new Vector<Integer>(n);
		for(int i =0;i<n;i++)
		{
			vector.add(i);
		}
		System.out.println(vector);
		
		vector.remove(4);
		System.out.println(vector);
		
		for(int j =0;j<n;j++)
		{
			System.out.println();
		}
	}

}

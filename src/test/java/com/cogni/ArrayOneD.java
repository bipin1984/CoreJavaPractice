package com.cogni;

public class ArrayOneD {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		System.out.println(a.length);
		System.out.println(a);
//		a[2] = 20;
//		a[5] = 40;
//		a[10] = 100;
		
		for(int index=a.length-1; index>=0; index--)
		{
			a[index]=(int)(Math.random()*1000);
			System.out.println(a[index]);
		}
		
//		for(int var: a)
//		{
//			System.out.println(a);
//		}
		
		
		
	}

}

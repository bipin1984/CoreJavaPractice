package com.Intv;

import java.util.Arrays;
import java.util.Collections;

public class SortingOfArray {

	public static void main(String[] args) {
		int a[] = {67,34,12,87,54,23};
		char b[] = {'p','c','k','d','h','n'};
		Integer c[] = {67,34,12,87,54,23};
		Character d[] = {'p','c','k','d','h','n'};
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		System.out.println("Array After sort :"+Arrays.toString(a));
		System.out.println("Array After sort :"+Arrays.toString(b));
		
		
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println("Array After sort :"+Arrays.toString(a));
		System.out.println("Array After sort :"+Arrays.toString(b));
		
		Arrays.sort(c,Collections.reverseOrder());
		Arrays.sort(d,Collections.reverseOrder());
		System.out.println("Array After sort :"+Arrays.toString(c));
		System.out.println("Array After sort :"+Arrays.toString(d));
	
		
		
	}

}

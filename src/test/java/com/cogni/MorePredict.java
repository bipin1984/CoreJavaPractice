package com.cogni;

import java.util.function.Predicate;

public class MorePredict {

	public static void main(String[] args) {

		int a[] = {20,34,12,56,45,98,56,39,129,74};
		Predicate<Integer> pr = i->(i%2==0);
		Predicate<Integer> pr1 = i->(i<50);
		
		for(int n:a)
		{
			if(pr.or(pr1).test(n))
			{
				System.out.println(n);
			}
		}

	}

}

package com.cogni;

import java.util.function.Predicate;

public class LamPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> p = i -> (i>10);
		System.out.println(p.test(20));
		System.out.println(p.test(5));
		
		
		Predicate<String> pr = name -> (name.length()>6);
		System.out.println(pr.test("Selenium"));
		System.out.println(pr.test("Java"));
		
		String names[] = {"Vipin","Pranati","Suman","Gitanjali","Devansh"};
		for(String name:names)
		{
			Predicate<String> prs = nm->(nm.length()<=5);
			if(prs.test(name)==true)
				{
					System.out.println(name);
				}
		}

	}

}

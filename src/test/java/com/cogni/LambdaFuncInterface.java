package com.cogni;

import java.util.function.Function;

public class LambdaFuncInterface {

	public static void main(String[] args) {
		
		Function<Integer,Double> f=n->n*(9/5+.32);
		System.out.println(f.apply(5));
		System.out.println(f.apply(10));
		System.out.println(f.apply(15));
		
		
		Function<String,Integer> fn = n->n.length();
		System.out.println(fn.apply(("Bipin Behera")));
		System.out.println(fn.apply(("Java Programming!!")));
	}

}

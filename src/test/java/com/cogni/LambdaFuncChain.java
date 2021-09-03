package com.cogni;

import java.util.function.Function;

public class LambdaFuncChain {

	public static void main(String[] args) {

		Function<Integer,Integer> fn=n->n*2;
		Function<Integer,Integer> fn1=n->n*n*n;
		
		System.out.println(fn.andThen(fn1).apply(3));
	}

}

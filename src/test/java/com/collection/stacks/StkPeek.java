package com.collection.stacks;

import java.util.Stack;

public class StkPeek {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);
		stk.push(15);
		stk.push(9);
		stk.push(21);
		stk.push(76);
		stk.push(98);
		
		System.out.println("get the peek number from the stack :"+stk.peek());
		System.out.println("Size of the stcak :"+stk.size());
		
		for(Integer i: stk)
		{
			System.out.println(i);
		}
		
		stk.forEach(k -> System.out.println(k));
		
		
		
	}

}

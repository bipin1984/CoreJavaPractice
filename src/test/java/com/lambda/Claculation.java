package com.lambda;

import com.lambda.Claculation.funcInterface1;


public class Claculation {
	
	interface funcInterface1
	{
		int opeation(int a, int b);
	}
	interface funcInterface2
	{
		void sayMessage(String mesaage);
	}
	
	private int operate(int a, int b, funcInterface1 fobj)
	{
		return fobj.opeation(a, b);
	}

	public static void main(String[] args) {
	 
		Claculation data = new Claculation();
		
		funcInterface1 add = (int x , int y )-> x+y;
		funcInterface1 mul = (int x , int y )-> x*y;
		funcInterface1 div = (int x , int y )-> x/y;
		
		System.out.println(data.operate(10, 5, add));
		System.out.println(data.operate(10, 5, mul));
		System.out.println(data.operate(10, 5, div));
		
		funcInterface2 obj = message -> System.out.println("Hello "+message);
		obj.sayMessage("Bipin");
	}

}

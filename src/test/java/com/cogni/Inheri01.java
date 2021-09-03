package com.cogni;

class A
{
	int a;
	int b;
	void display() {
		System.out.println("Sum of two number a & b:"+(a+b));
	}
	
}

class B extends A
{
	int p;
	int q;
	void show() {
		System.out.println("Sum of two number p & q :"+(p+q));
	}
	
}

class C extends A
{
	int x;
	int y;
	void publish() {
		System.out.println("Sum of two number x & y :"+(x+y));
	}
	
}

public class Inheri01 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C cc = new C();
		
	
		

	}

}

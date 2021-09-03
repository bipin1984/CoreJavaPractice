package com.cogni;

public class OverLoading {

	int a;
	int b;
	int c;
	double s;
	void display(int p, int q)
	{
		a = p;
		b = q;
		System.out.println("Value of a: "+a +"  and Value of b:"+b);
	}
	
	void display(double t, int p,int r)
	{
		s = t;
		b = p;
		c = r;
		 double sum = t + b + c;
		 System.out.println("Sum is :"+sum);
	}
	void display(int r, int q,int p)
	{
		c = p;
		b = r;
		a = q;
		
		System.out.println("Value of a: "+a +" and Value of b:"+b+" And value of c:"+c);
	}
	
	public static void main(String[] args) {
		OverLoading overL = new OverLoading();
		
		overL.display(20,30);
		overL.display(20.5,10,23);
		overL.display(5,10,15);
		
	}

}

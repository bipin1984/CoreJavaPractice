package com.cogni;

public class ConstOverLoad {
	
	int p;
	int q;
	int r;
	
	
	
	ConstOverLoad()
	{
		p = 1;
		q = 2;
		r = 3;
	}
	
	ConstOverLoad(int p,int q, int r)
	{
		this.p = p;
		this.q = q;
		this.r = r;
	}
	
	ConstOverLoad(int x, int y)
	{
		p = x;
		q = y;
	
	}
	
	ConstOverLoad(int q)
	{
		this.q = q;
	
	}
	

	void display()
	{
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
	}
	public static void main(String[] args) {
		
		ConstOverLoad constOverLoad = new ConstOverLoad(10,20,30);
		ConstOverLoad constOverLoad1 = new ConstOverLoad(120,130);
		ConstOverLoad constOverLoad2 = new ConstOverLoad(300);
		ConstOverLoad constOverLoad3 = new ConstOverLoad();
		
		constOverLoad.display();
		constOverLoad1.display();
		constOverLoad2.display();
		constOverLoad3.display();
	}

}

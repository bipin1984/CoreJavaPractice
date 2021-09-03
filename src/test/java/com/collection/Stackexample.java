package com.collection;

class stack
{
	static final int MAX = 1000;
	int top;
	int a[] = new int[MAX];
	
	boolean isEmpty()
	{
		return (top < 0);
	}
	stack()
	{
		top = -1;
	}
	
	boolean push(int x)
	{
		if (top>=(MAX-1))
		{
			System.out.println("Stack us overflow");
			return false;
			 
		}else
		{
			a[++top] =x;
			return true;
		}
		
		
	}
	
	
	int pop()
	{
		if(top < 0)
		{
			System.out.println("Stack is underflow");
			return 0;
		}else
		{
			int x = a[top--];
			System.out.println(x + " Pushed into the stack !");
			return x;
		}
	}
	
	int peek()
	{
		if(top < 0)
		{
			System.out.println("Stack is underflow !");
			return 0;
		}
		else
		{
			int x = a[top];
			return x;
		}
	}
}

public class Stackexample {

	public static void main(String[] args) {
		
		stack stk = new stack();
		stk.push(10);
		stk.push(30);
		stk.push(50);
		System.out.println(stk.peek());
		System.out.println(stk.pop()+ " Popped from stack");
		System.out.println(stk.peek());
		System.out.println(stk.isEmpty());
		
		
	}

}

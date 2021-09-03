package com.lambda;

interface Drawable
{
	public void draw();
}

public class Lambda01 {

	public static void main(String[] args) {
		
		int width=20;
		
//		Drawable d = new Drawable() {		
//		public void draw()
//		{
//			System.out.println("Drawing :"+width);
//			
//		}};
//		
//		d.draw();
		
		Drawable d = ()->{
			System.out.println("Drawing :"+width);
		};
		d.draw();
	}
}

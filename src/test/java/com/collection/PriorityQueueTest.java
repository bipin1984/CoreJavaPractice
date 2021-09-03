package com.collection;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		
		PriorityQueue<String> pQue = new PriorityQueue<String>();
		
		PriorityQueue<Integer> pQue1 = new PriorityQueue<Integer>();
		
		pQue.add("Suman Priya");
		pQue.add("Bipin Behera");
		pQue.add("Pranati M");
		pQue.add("Umesh B");
		
		System.out.println("First Added :"+pQue.peek());
		System.out.println("First Polled :"+pQue.poll());
		System.out.println("Next First Added :"+pQue.peek());

		pQue1.add(10);
		pQue1.add(20);
		pQue1.add(30);
		pQue1.add(40);
		System.out.println("First Added :"+pQue1.peek());
		System.out.println("First Polled :"+pQue1.poll());
		System.out.println("Next First Added :"+pQue1.peek());
	}

}

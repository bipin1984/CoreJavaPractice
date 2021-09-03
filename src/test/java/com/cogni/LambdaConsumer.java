package com.cogni;

import java.util.function.Consumer;

public class LambdaConsumer {

	public static void main(String[] args) {
		
		Consumer<Integer> c=s->System.out.println(s);
		c.accept(10);

	}

}

package com.example.java.oops.Java8;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s);
		c.accept("Welcome");

	}

}

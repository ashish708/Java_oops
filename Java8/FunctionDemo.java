package com.example.java.oops.Java8;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f =n->n*n;
		
		System.out.println(f.apply(5));
		
		//string length
		Function<String, Integer> f1 = p->p.length();
		System.out.println(f1.apply("Ashish"));

	}

}

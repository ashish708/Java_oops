package com.example.java.oops.interview;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		//print random number
		
		Random random = new Random();
		random.ints().limit(5).sorted().forEach(n->System.out.println(n));//or System.out::println
	}

}

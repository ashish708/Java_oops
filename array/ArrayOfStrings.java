package com.example.java.oops.array;

public class ArrayOfStrings {

	public static void main(String[] args) {
		// array of strings is same as array of integers

		String[] words = new String[3];

		words[0] = "hii";
		words[1] = "ashish";
		words[2] = "nayak";

		System.out.println(words[2]);

		// next example

		String fruits[] = { "apple", "grapes", "orange", "banana", "kiwi" };

		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		// null example
		String animals[] = new String[2];
		System.out.println(animals[0]);
	}

}

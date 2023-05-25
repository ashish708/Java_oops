package com.example.java.oops.Java8;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// example-1
		Predicate<Integer> p2 = i -> i > 10;
		System.out.println(p2.test(5));

		// example-2 check the length of string > 4 or not
		Predicate<String> pr = p -> (p.length() > 4);
		System.out.println(pr.test("Ashish"));// true
		System.out.println(pr.test("Ash "));// false

		// ex-3 print array elements whose size is > 4 from array
		String names[] = { "Ashish", "Scott", "David", "lipun", "papu" };
		for (String name : names) {

			if (pr.test(name)) {
				System.out.println(name);
			}

//			if(name.length()>4) {
//				System.out.println(name);
//			}
		}
	}

}

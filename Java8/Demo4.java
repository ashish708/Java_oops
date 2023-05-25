package com.example.java.oops.Java8;

import java.util.function.Predicate;

// joining predicates - and , or , neagte

public class Demo4 {

	public static void main(String[] args) {
		// check no. is even and greater than 50

		int a[] = { 5, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65 };

		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 50;

		// and
//		for(int n : a) {
//			if(p1.and(p2).test(n)) { //p1.test(n) && p2.test(n)
//				System.out.print(" "+n);
//			}
//		}

		// OR
//		for(int n : a) {
//			if(p1.or(p2).test(n)) { //p1.test(n) && p2.test(n)
//				System.out.print(" "+n);
//			}
//		}

		// negate

		for (int n : a) {
			if (p1.negate().test(n)) { // p1.test(n) && p2.test(n)
				System.out.print(" " + n);
			}
		}

	}

}

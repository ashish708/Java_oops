package com.example.java.oops.array;

import java.util.Arrays;

public class ComparisonVSequals {

	public static void main(String[] args) {
		// == vs equals() method

		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = { 10, 20, 30, 40, 50 };

		if (a == b) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}

		if (Arrays.equals(a, b)) {
			System.out.println("Both are equal");
		} else {
			System.out.println("Both are not equal");
		}

	}

}

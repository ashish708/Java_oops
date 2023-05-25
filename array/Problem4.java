package com.example.java.oops.array;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// reverse elements in array
		int[] a = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter elements : ");

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("Array Elements : ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\nReverse elements : ");

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}

}

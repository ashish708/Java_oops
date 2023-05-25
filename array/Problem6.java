package com.example.java.oops.array;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// sum of array elements
		int sum = 0;
		int[] a = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter elements : ");

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("Array elements : ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			sum += a[i];
		}
		System.out.println("\nSum Total : " + sum);
	}

}

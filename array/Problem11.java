package com.example.java.oops.array;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// find biggest element in array
		int max;
		int[] a = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter elements : ");

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("max is : " + max);
	}

}

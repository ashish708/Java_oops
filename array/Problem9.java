package com.example.java.oops.array;

import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// sort array elements in ascending order

		int temp;
		int[] a = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter elements : ");

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("Sorted elements : ");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}

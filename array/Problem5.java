package com.example.java.oops.array;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// copy array elements

		int[] a = new int[5];
		int[] b = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Elements : ");

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("1st Array elements : ");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}

		System.out.print("\n2nd Array elements : ");

		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
			System.out.print(b[i] + " ");
		}

	}

}

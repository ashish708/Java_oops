package com.example.java.oops.array;

import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		// average array elements
		int sum = 0;
		double avg;
		int[] a = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter elements : ");

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Array Elements : ");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		avg = sum / 5.0;
		System.out.print("\nTotal sum : " + sum);
		System.out.println("\navg is : " + avg);
	}

}

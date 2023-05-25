package com.example.java.oops.array;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// search array elements

		int count = 0;
		int[] a = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter elements : ");

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("Array elements : ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\nEnter search elements : ");
		int n = s.nextInt();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				count++;
			}
		}
		if (count > 0)
			System.out.println("Item Found " + count + " times ");
		else
			System.out.println("Item Not Found");
	}

}

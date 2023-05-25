package com.example.java.oops.array;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {

		int size, i;
		System.out.println("Enter size of array : ");
		Scanner s = new Scanner(System.in);
		size = s.nextInt();
		int a[] = new int[size];

		for (i = 0; i < size; i++) {
			a[i] = s.nextInt();
		}
		System.out.println("Printed Array Elements ");

		for (i = 0; i < size; i++) {
			System.out.println(a[i] + " ");
		}

	}
}

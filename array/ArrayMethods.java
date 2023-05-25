package com.example.java.oops.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethods {

	public static void main(String[] args) {
		// sort()
		int[] a = new int[5];
//		int[] b = new int[5]; // for equals method
		Scanner s = new Scanner(System.in);
		System.out.print("Enter elements for 1st : ");

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
//		System.out.print("Sorted elements : ");
//		Arrays.sort(a);
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}

		// equals method

//		System.out.print("Enter elements for 2nd : ");
//		for (int i = 0; i < a.length; i++) {
//			b[i] = s.nextInt();
//		}
//		boolean c = Arrays.equals(a, b);
//		System.out.print("kya dono equal hai : " + c);

		// copyOf method

		int[] b = Arrays.copyOf(a, 6);
		b[5] = 100;
		System.out.println("Data in array2 ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}

package com.example.java.oops.array;

//import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		//find length of array
		
		int a[] = new int[5];
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Enter elements : ");
		
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
		}
		System.out.print("Array Elements : ");
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\nArray Length is : " + a.length);

	}

}

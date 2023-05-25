package com.example.java.oops.interview;

import java.util.Scanner;

public class DivisibleByFive {
	public static void main(String[] args) {

		// variable create
		int n;

		// scanner class object
		Scanner s = new Scanner(System.in); // system.in mane ame nije input daba

		// read an integer
		System.out.println("Enter any number : ");
		n = s.nextInt();// setebela jain wait kariba jetebele jain integer na milichi aku

		if (n % 5 == 0) {
			System.out.println(n + " Divisible by 5");
		} else {
			System.out.println(n + " Not divisible by 5");
		}
		s.close();
	}
}

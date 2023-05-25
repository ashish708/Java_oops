package com.example.java.oops.interview;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("Enter input 1 : ");
			int x = scan.nextInt();
			System.out.print("Enter input 2 : ");
			int y = scan.nextInt();
			System.out.print("Output is : " + x / y);
		} catch (InputMismatchException i) {
			System.out.print("Output is : " + i);
		} catch (ArithmeticException a) {
			System.out.print("Output is : " + a);
		}
		scan.close();
	}
}
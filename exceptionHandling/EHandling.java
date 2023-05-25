package com.example.java.oops.exceptionHandling;

import java.sql.SQLException;
import java.util.Scanner;

public class EHandling{

	public static void main(String[] args){ //checked exception use here using throws keyword

		System.out.println("Started .. "); // starting
		try {

//			int n1 = Integer.parseInt(args[0]);
//			int n2 = Integer.parseInt(args[1]);
			int n1;
			Scanner s1 = new Scanner(System.in);
			System.out.println("Enter n1 number : ");
			n1 = s1.nextInt();
			
			int n2;
			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter n2 number");
			n2 = s2.nextInt();

			System.out.println("we have got two numbers : ");

			int result = n1 / n2;
			System.out.println("Division is " + result);

		} catch (Exception e) {
			System.out.println(e + " Error !!!");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Success");
		}
		System.out.println("Terminated ..."); // ending point
	}
}

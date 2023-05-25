package com.example.java.oops.Java8;

@FunctionalInterface
interface Cab1{
	public void bookCab(String source, String destination);
}

public class Demo2 {

	public static void main(String[] args) {
		Cab1 cab = (String source, String destination)->System.out.println(source + " " + destination);
		cab.bookCab("BBSR", "Jajpur");

	}

}

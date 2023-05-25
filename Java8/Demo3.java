package com.example.java.oops.Java8;

@FunctionalInterface
interface Cab {
	 String bookCab(String source, String destination);
}

public class Demo3 {

	public static void main(String[] args) {
		
		Cab cab=(String source, String destination)->{
				System.out.println(source + " to " + destination);
				return ("Price: RS 5000");
				};             
			System.out.println(cab.bookCab("BBSR", "CTC"));
		}
	}

  
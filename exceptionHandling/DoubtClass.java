package com.example.java.oops.exceptionHandling;

public class DoubtClass {
	public static void main(String[] args) {
		
		try {
			int[] list = new int[4];
	        System.out.println(list[4]);
//			System.out.println(1.0/0);
		}finally {
			System.out.println("main method ended");
		}
		}
//		try {
//			System.out.println("hello world");
//			System.exit(0);
//		} finally {
//			System.out.println("hii");
//		}
	}
package com.example.java.oops.interfaceImplementation;

//interface A {
//	public static void show() {
//		System.out.println("can't override interface static methods");
//	} // public+abstract
//}

//class Demo implements A {
//	@Override
//	public static void Show() {
//		System.out.println("can't override interface static methods");
//
//	}
//}

// private interface

interface A {
	// or we can put static for calling private interface
	private static void add(int x, int y) {
		System.out.println("sum : " + (x + y));
	}

	// 1st method to call private interface
//	default void call() {
//		add(10,20);
//	}
	public static void call() {
		add(10, 20);
	}
}

class B implements A {
	public void sub(int x, int y) {
		System.out.println("sub : " + (x - y));
	}
}

public class NewInterface {

	public static void main(String[] args) {
		// interface static method
//		A.show();

		// private interface
		B b = new B();
//		b.add(20,10); // it will give error
//		b.call();
		A.call();
		b.sub(200, 100);

	}

}

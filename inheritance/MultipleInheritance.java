package com.example.java.oops.inheritance;

// using class which will give error

//class A {
//	void show() {
//		System.out.println("Class A");
//	}
//}
//
//class B {
//	void show() {
//		System.out.println("Class B");
//	}
//}
//
//public class MultipleInheritance extends A,B{
//
//	public static void main(String[] args) {
//		MultipleInheritance m = new MultipleInheritance();
//		m.show();
//	}
//
//}

// using interface

interface A1 {
	void show();
}

interface B1 {
	void disp();
}

public class MultipleInheritance implements A1, B1 {

	public static void main(String[] args) {
		MultipleInheritance m = new MultipleInheritance();
		m.show();
		m.disp();
	}

	@Override
	public void show() {
		System.out.println("Interface A & B");
	}

	@Override
	public void disp() {
		System.out.println("interface B");
	}

}

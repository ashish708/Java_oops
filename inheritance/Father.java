package com.example.java.oops.inheritance;

class D {

	// hierarchical inheritance

	void input() {
		System.out.println("Enter your name : ");
	}
}

class E extends D {

	void show() {
		System.out.println("My name is Ravan");
	}
}

public class Father extends D {

	void disp() {
		System.out.println("My name is Ram");
	}

}

class Demo {
	public static void main(String[] args) {
		E r = new E();
		Father r2 = new Father();
		r.input();
		r.show();
		r2.input();
		r2.disp();
	}
}

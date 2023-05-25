package com.example.java.oops;

class A {
//	int a = 10; //for variable

	// for method
//	void show() {
//		System.out.println("Hello world");
//	}

	// for constructor
	A(int a) {
		System.out.println("Hello world " + a);
	}
}

class B extends A {
//	int a = 20;
	
	//for method
	
//	void show() {
//		super.show();
//		System.out.println("Hello babyGirl"); // 20
////		System.out.println(super.a);// 10
//
//	}

	B() {
// if we dont write super() then constructor automatically take for default constructor

		super(12); // but for parameterized constructor we have to put super() otherwise it will give error.
		System.out.println("Hello babyGirl");
	}
}

public class SuperKeyword {
	public static void main(String[] args) {
		// super keyword use case
		// o/p is 20 but after using super we get 10 as o/p

		B r = new B();
//		r.show(); // for method

	}

}

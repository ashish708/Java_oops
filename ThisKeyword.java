package com.example.java.oops;

public class ThisKeyword {

	ThisKeyword() {
		this(12);
//		System.out.println("Hello BabyGirl");
	}

//	int a;
	ThisKeyword(int a) {
//		this();
		System.out.println(a);

//		this.a=a;
	}

//	void show() {
//		System.out.println(a);
//	}

	public static void main(String[] args) {
		// this keyword use case

		ThisKeyword r = new ThisKeyword();
//		System.out.println(r);
//		r.show();
	}

}

package com.example.java.oops.interview;

class A {
	int x;
	String y;

	A(int a, String b) {
		x = a;
		y = b;
		System.out.println(x + " " + y);
	}

	A(A ref) {
		x = ref.x;
		y = ref.y;
		System.out.println(x + " " + y);
	}

}

public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A r = new A(10, "Ashish");
		A r2 = new A(r);

	}

}

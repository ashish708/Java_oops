package com.example.java.oops.inheritance;

class A { // super class
	int a, b, c;

	void add() {
		a = 10;
		b = 20;
		c = a + b;
		System.out.println("Addition : " + c);
	}

	void sub() {
		a = 10;
		b = 20;
		c = a - b;
		System.out.println("Substraction : " + c);
	}
}

class B extends A { // sub-class-1

	void multi() {
		a = 10;
		b = 20;
		c = a * b;
		System.out.println("Multiplication : " + c);
	}

	void div() {
		a = 10;
		b = 20;
		c = a / b;
		System.out.println("Divison : " + c);
	}
}

class C extends B { // sub-class-2
	void rem() {
		a = 10;
		b = 20;
		c = a % b;
		System.out.println("Remainder : " + c);
	}
}

class Parent {
	public static void main(String[] args) {
		C r = new C();
		r.add();
		r.sub();
		r.multi();
		r.div();
		r.rem();
	}
}

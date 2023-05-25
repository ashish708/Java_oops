package com.example.java.oops.abstraction;

public abstract class Abstraction {

	// complete method
	public void cal() {
		System.out.println("calculating results");
	}

	abstract public void rocket();
}

class Start {
	public static void main(String[] args) {
		MyChild child = new MyChild();
		child.rocket();
		child.cal();

	}
}
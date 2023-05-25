package com.example.java.oops.inheritance;

class Student { //super class

	int roll, marks;
	String name;

	void input() {
		System.out.println("Enter roll name & marks");
	}
}

class Ashish extends Student { //sub-class
	void display() {
		roll = 1;
		name = "ashish";
		marks = 90;
		System.out.println(roll + " " + name + " " + marks);
	}

	public static void main(String[] args) {
		// simple or single inheritance
		Ashish r = new Ashish();
		r.input();
		r.display();
	}
}

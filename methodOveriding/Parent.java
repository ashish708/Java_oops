package com.example.java.oops.methodOveriding;

public class Parent {
	//overridden method(jie change hauchi)
	public void m1() {
		System.out.println("iam m1 of parent");
	} 
}

class Child extends Parent{
	//overriding method(jie change karuchi)
	//return types should be covariant
	public void m1() {
		System.out.println("iam m1 of child");
	}
}
//accessbility   
//public > protected > default > private
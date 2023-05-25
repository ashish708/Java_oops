package com.example.java.oops.collections;

import java.util.*;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		//type safe vector
		
		Vector<String> vector = new Vector<String>();
		vector.add("papu");
		vector.add("ashish");
		vector.add("amarjit");
		vector.add("rinkan");
		vector.add("chinmaya");
		
		System.out.println("Vector" + vector);
//		Vector<Integer> vector = new Vector<>();
//		vector.addAll(names);
	}
}

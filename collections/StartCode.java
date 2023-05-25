package com.example.java.oops.collections;

import java.util.*; //* will import all classes

public class StartCode {

	public static void main(String[] args) {

		System.out.println("Welcome to java collections");

		// arrayList create

		// Creating a List of type Integer using ArrayList
//		List<Integer> list=new ArrayList<Integer>();  

		// type safe collection
		ArrayList<Integer> names = new ArrayList<Integer>(); // diamond array will work like type safe
		names.add(100);
		names.add(200);
		names.add(300);

		// check size
		System.out.println("size " + names.size());

		// check empty or not
		System.out.println(names.isEmpty());

		// set value
		System.out.println(names.set(0, 500));

		// add elements
		names.add(1, 230);

		// remove method
		names.remove(0);
		names.remove(Integer.valueOf(100));

		// remove all elements
		names.clear();
		System.out.println(names);

		// check item use contains method
		// it will print true or false
		System.out.println(names.contains("papu"));
		System.out.println(names);
//		System.out.println(names.get(0));
//		System.out.println(names.get(0));//indexing

		Vector<Integer> vector = new Vector<>();
		vector.addAll(names);

	}

}

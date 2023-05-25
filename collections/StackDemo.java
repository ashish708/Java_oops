package com.example.java.oops.collections;

import java.util.Stack;

//last in first out (LIFO)
public class StackDemo {
	
	public static void main(String[] args) {
		Stack<String> animals = new Stack<>();
		animals.push("Lion");
		animals.push("Tiger");
		animals.push("Cow");
		animals.push("Dog");
		
		System.out.println("Stack : " + animals);
		
		//peak method use for last in first out
		System.out.println(animals.peek());
		
		animals.pop();//top element is removed
		
		System.out.println("Stack : " + animals);

		System.out.println(animals.peek());
	}
}

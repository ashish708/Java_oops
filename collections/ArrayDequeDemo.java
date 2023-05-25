package com.example.java.oops.collections;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {

		ArrayDeque<Integer> aq = new ArrayDeque<>();

		aq.offer(10);
		aq.offerFirst(20);
		aq.offerLast(30);
		aq.offer(40);

		System.out.println(aq);

		System.out.println(aq.peek());//1st element will popout who is going to out
		System.out.println(aq.peekFirst());
		System.out.println(aq.peekLast());

		System.out.println(aq.poll());//poll will remove 1st element from top
		System.out.println("poll : " + aq);

		System.out.println(aq.pollFirst());//remove first element
		System.out.println("pollFirst : " + aq);

		System.out.println(aq.pollLast());//remove last element
		System.out.println("pollLast : " + aq);
	}

}

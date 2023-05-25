package com.example.java.oops.collections;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueDemo {

	public static void main(String[] args) {
		
		//Queue is an interface implemented by Arraylist,LinkedList and priority queue
		Queue<Integer> queue = new LinkedList<>(); //linkedList basically implements queue
		
		queue.offer(12);//offer add elements in queue(return true or false for add elements)
		queue.offer(13);
		queue.offer(15);
		queue.offer(17);
		queue.offer(18);
		
		System.out.println(queue);
		
		//poll remove (from top) as well return element
		System.out.println(queue.poll());
		
		System.err.println(queue.peek());
		System.out.println(queue);
		
	}
}

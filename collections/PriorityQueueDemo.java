package com.example.java.oops.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		//Comparator.reverseOrder() coverted into max heap by default min heap is present
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		pq.offer(100);
		pq.offer(20);
		pq.offer(30);
		pq.offer(40);
		pq.offer(50);
		
		System.out.println(pq);
		
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.peek());//2nd top element removed
	}

}

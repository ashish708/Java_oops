package com.example.java.oops.collections;

import java.util.*;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		//unsafe type
//		LinkedList<String> list = new LinkedList<String>();
//		list.add("ashish");
//		list.add("papu");
//		list.add("rinkan");
//		System.out.println(list);
		
		//unsafe type
		LinkedList list = new LinkedList();
		list.add("ashish");
		list.add(123);
		list.add(43.656);
		list.add(true);
		System.out.println(list);
	}
}

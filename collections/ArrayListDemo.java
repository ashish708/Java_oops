package com.example.java.oops.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);

		Collections.reverse(list); // reverse an elements

		System.out.println("Reverse : " + list);

		// iterate for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println("the element is :" + list.get(i));
		}

		// for-each type
		for (Integer element : list) {
			System.out.println("for-each element is :" + element);
		}

		// iterator
		Iterator<Integer> it = list.iterator();

		// hasnext indicates next elements
		while (it.hasNext()) {
			System.out.println("iterator :" + it.next());
		}
		
//		ArrayList<String> al = new ArrayList<String>();
//		al.add(1,"ashish");
//		al.add(2,"ashi");
//		al.add(3,"assh");
//		al.add(4,"aish");
//		
//		ListIterator<String> li = al.listIterator();
//		
//		while(li.hasNext()) {
//			System.out.println(li.next());
//		}
//		while(li.hasPrevious()) {
//			System.out.println(li.previous());
//		}

	}

}

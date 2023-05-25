package com.example.java.oops.streamfilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

//		Collections.sort(al);
//		Collections.reverse(al);
//		System.out.println(al);

		al.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));// descending
	}

}

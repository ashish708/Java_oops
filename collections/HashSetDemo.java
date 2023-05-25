package com.example.java.oops.collections;
	
import java.util.*;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet<Double> set = new HashSet<>();
		set.add(11.11);
		set.add(12.12);
		set.add(2345.6789);//we can do this by creating object but we dont need bcoz it is automatically doing autoboxing
		set.add(99.30);
		set.add(99.30);//duplicates not allowed
		
		System.out.println(set);
		
		
	//TreeSet
		TreeSet<Double> test = new TreeSet<>();
		test.addAll(set);
		
		System.out.println(test );
	}
}

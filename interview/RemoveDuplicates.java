package com.example.java.oops.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// remove duplicates
//		List<Integer> al = Arrays.asList(1, 2, 2, 3, 5, 6, 5, 6, 1);
//		al.stream().collect(Collectors.toSet()).forEach(System.out::println);
//		// sum of duplicates
//		int sum = al.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
//				.stream().filter(entry -> entry.getValue() > 1).mapToInt(entry -> entry.getKey()).sum();
//		System.out.println("Sum of Duplicates : "+sum);
		 

		
		ArrayList<Integer> pl = new ArrayList<>();
		pl.add(1);
		pl.add(2);
		ArrayList<Integer> cl = new ArrayList<>();
		cl.add(3);
		cl.add(4);
		
		pl.addAll(cl);
		

		System.out.println(pl); // print the updated pl list



	}
}

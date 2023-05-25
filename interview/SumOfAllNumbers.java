package com.example.java.oops.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class SumOfAllNumbers {

	public static void main(String[] args) {
		
		// sum of all numbers present in a list

		List<Integer> al = Arrays.asList(10, 20, 30, 40, 50);
		int sum = al.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);

		// filter greater than 100 then find average of remaining

		List<Integer> cl = Arrays.asList(10,20,30,40,50);
		OptionalDouble AverageOfSquares = cl.stream().map(n -> n * n).filter(n -> n > 100).mapToDouble(n -> n)
				.average();
//		System.out.println(AverageOfSquares);
		if (AverageOfSquares.isPresent()) {
			System.out.println("Average of squares of numbers greater than 100: " + AverageOfSquares.getAsDouble());

		} else {
			System.out.println("No numbers greater than 100 in the list.");
		}

		// find highest and lowest of a stream
		List<Integer> dl = Arrays.asList(100, 230, 350, 740, 950, 1050);
		Integer min = dl.stream().min(Integer::compare).get();
		Integer max = dl.stream().max(Integer::compare).get();
		System.out.println("Min Value : "+min);
		System.out.println("Max Value : "+max);
		
		//iterate a Stream using the forEach method
		
		List<Integer> pl = Arrays.asList(1,5,2,4,3);
		pl.stream().sorted().forEach(System.out::println);

		
		
		
		

	}

}

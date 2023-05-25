package com.example.java.oops.interview;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerDemo {

	public static void main(String[] args) {
		// to add sufix and prefix

		StringJoiner joiner = new StringJoiner(",", "#", "#");
		joiner.add("Ashish");
		joiner.add("Lipun");
		joiner.add("Kumar");
		joiner.add("Nayak");

		System.out.println(joiner);

		List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 100, 78, 45, 35, 69);
		// sorting with iterating
		al.stream().sorted().forEach(System.out::println);
		// max
		int max = al.stream().max(Integer::compare).get();
		System.out.println("Max : " + max);
		// min
		int min = al.stream().min(Integer::compare).get();
		System.out.println("Min : " + min);
		// sum
		int sum = al.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum : " + sum);
		// even number
		List<Integer> even = al.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Even : " + even);
		// sum of even numbers
		int sumEven = al.stream().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println("SumOfEvenNumber : " + sumEven);
		// odd number
		List<Integer> odd = al.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd : " + odd);
		// sum of odd numbers
		int sumOdd = al.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
		System.out.println("SumOfOddNumber : " + sumOdd);
		
		//cube on list elements and filter numbers greater than 50.
		al.stream().map(n->n*n*n).filter(n->n>50).forEach(System.out::println);

	}

}

package com.example.java.oops.streamfilter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);
		// type 1
		int sum = numbers.stream().mapToInt(i -> i).sum();
		System.out.println(sum);

		// type 2
		int sum1 = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum1);

		// type 3
		Optional<Integer> sum2 = numbers.stream().reduce(Integer::sum);
		System.out.println(sum2);

		// type 4
		Integer minvalue = numbers.stream().reduce(1, (a, b) -> a < b ? a : b);
		 System.out.println(minvalue);

		// type 5 with MethodReference
		Integer minValue = numbers.stream().reduce(Integer::min).get();
		System.out.println(minValue);

		// using string
		List<String> words = Arrays.asList("Ashish", "Ashish Lipun", "Ashish Kumar Nayak");
		String longestString = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
				.get();
		System.out.println(longestString);

		String shortest = words.stream().reduce((word1, word2) -> word1.length() < word2.length() ? word1 : word2)
				.get();
		System.out.println(shortest);

		// realtime ex
		//1st select person with grade A then get avgSalary 

//		double avgSalary = EmpDb.getEmployees().stream().filter(emp -> emp.getGrades().equalsIgnoreCase("A"))
//				.map(emp -> emp.getSalary()).mapToDouble(i -> i).average().getAsDouble();
//		System.out.println(avgSalary);
		
		//sum salary for grade A
//		double sum = EmpDb.getEmployees().stream().filter(emp -> emp.getGrades().equalsIgnoreCase("A"))
//				.map(emp -> emp.getSalary()).mapToDouble(i -> i).sum();
//		System.out.println(sum);

	}
}

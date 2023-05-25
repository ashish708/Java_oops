package com.example.java.oops.streamfilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import com.example.java.oops.polymorphism.Employee;

public class ParallelStreamsDemo {

	public static void main(String[] args) {
		long start,end = 0;
		
		//for sequential stream
		start=System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::println);
		
		end=System.currentTimeMillis();
		System.out.println("Plain stream took time : " + (end-start));//order constant
		//o/p is like 1,2,3,4,etc....
		
		//parallel stream
		start=System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::println);
		
		end=System.currentTimeMillis();
		System.out.println("Parallel stream took less time : " + (end-start));//order not constant
		//o/p is like 2,60,34, etc..
		
		//sequenctially
		IntStream.range(1, 10).forEach(x->System.out.println("Thread : "+Thread.currentThread().getName()+" :"+x));
		
		//parallel
		IntStream.range(1, 10).parallel().forEach(x->System.out.println("Thread : "+Thread.currentThread().getName()+" :"+x));

		//example normal
//		start=System.currentTimeMillis();
//		double salary = emp.stream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
//		
//		end=System.currentTimeMillis();
//		System.out.println("Normal stream took  time : " + (end-start));
//		
//		//parallel stream 
//		double salary2 = emp.parallelStream().map(Employee::getSalary).mapToDouble(i->i).average().getAsDouble();
//		System.out.println("Parallel stream took less time : " + (end-start));//order not constant
		
		}
	}


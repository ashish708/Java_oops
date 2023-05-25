package com.example.java.oops.lambda;

import java.util.ArrayList;
import java.util.List;

public class ConsumerDemo {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.stream().forEach(t -> System.out.println(t)); // t is a local variable
	}

}

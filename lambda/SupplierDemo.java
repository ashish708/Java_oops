package com.example.java.oops.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> sp = () -> "I will rule this world one day.";
		System.out.println(sp.get());
		
		List<String> al = Arrays.asList( );
		System.out.println(al.stream().findAny().orElseGet(sp));
	}

}

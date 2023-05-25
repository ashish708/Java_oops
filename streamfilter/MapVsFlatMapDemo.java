package com.example.java.oops.streamfilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMapDemo {

	public static void main(String[] args) {
		// List<customer> convert List<String> -> Data transformation
		// customer -> customer.getEmail()-> one to one mapping go for map()

//		List<String> emails = customer.stream().map(customer->customer.getEmail()).collect(Collectors.toList());

		// for one to many go for flatMap()
		// List<String> phone =
		// customer.stream().flatMap(customer->customer.getPhone().stream()).collect(Collectors.toList());
		
		//map example
		ArrayList<String> fruit = new ArrayList<>();
	        fruit.add("grape");//5 letters
	        fruit.add("mango");//5 letters
	        fruit.add("pineapple");//9 letters
	        fruit.add("kiwi");//4 letters
	        System.out.println("List of fruit-" + fruit);
	        
	    System.out.println(fruit.stream().map(s->s.length()).collect(Collectors.toList())); 
	    
	    //flatmap example
        List<List<Integer>> number  = new ArrayList<>();
	    number.add(Arrays.asList(1, 2));
        number.add(Arrays.asList(3, 4));
        number.add(Arrays.asList(5, 6));
        number.add(Arrays.asList(7, 8));
       
        System.out.println("List of list-" + number);
        
        List<Integer> flatList= number.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println(flatList);
	  
	}

}

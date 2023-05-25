package com.example.java.oops.streamfilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Ashish", 1);
		map.put("Lipun", 3);
		map.put("Kulu", 5);
		map.put("Kunu", 8);

		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

		Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		// using stream
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);// using key
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);// using value

	}

}

package com.example.java.oops.streamfilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class StreamForEachDemo {

	public static void main(String[] args) {
		//forEach method
		
		List<String> al = new ArrayList<>();
		al.add("Ashish");
		al.add("Lipun");
		al.add("Kulu");
		al.add("Papulu");
		
//		al.stream().forEach(n->System.out.println(n));
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Ashish");
		map.put(2, "Lipun");
		map.put(3, "Kulu");
		map.put(4, "Papulu");
		
//		map.forEach((k,v)->System.out.println(k + " " + v));
//		map.entrySet().stream().forEach(n->System.out.println(n));
		
		Consumer<String> user = (t)->System.out.println(t);
		user.accept("Ashish");
	}

}

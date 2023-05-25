package com.example.java.oops.collectionSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.springframework.util.comparator.Comparators;

public class EmpDemo {

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<>();

		emp.add(new Employee(101, "Ashish", 101.00));
		emp.add(new Employee(105, "zeepak", 105.00));
		emp.add(new Employee(103, "pinkan", 110.00));
		emp.add(new Employee(102, "rapu", 121.00));

//		Collections.sort(emp, new EmpIdComparator());
		Collections.sort(emp, new EmpNameComparator());

		// anonymously
		Collections.sort(emp, new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
//				return e1.id - e2.id;
				if (e1.id > e2.id) {
					return 1; // -1 for descending
				} else if (e1.id < e2.id) {
					return -1; // 1 for descending
				} else {
					return 0;
				}
			}

		});

		for (Employee e : emp) {
			System.out.println(e);
		}

	}

}

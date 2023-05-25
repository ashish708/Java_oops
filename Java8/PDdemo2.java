package com.example.java.oops.Java8;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String ename;
	int salary;
	int experience;

	Employee(String name, int sal, int exp) {
		ename = name;
		salary = sal;
		experience = exp;
	}
}

public class PDdemo2 {

	public static void main(String[] args) {

		Employee emp = new Employee("Ashish", 100000, 2);

		Predicate<Employee> pr = e -> (e.salary > 30000 && e.experience > 3);
		System.out.println(pr.test(emp));

		// ex-2
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("john", 50000, 5));
		al.add(new Employee("lipun", 30000, 2));
		al.add(new Employee("papu", 20000, 3));
		al.add(new Employee("rinkan", 110000, 6));
		
		for(Employee e : al) {
			if(pr.test(e)) {
				System.out.println(e.ename+" "+e.salary );
			}
		}

	}

}

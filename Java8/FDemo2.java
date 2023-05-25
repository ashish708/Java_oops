package com.example.java.oops.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Employee1 {
	String ename;
	int salary;

	Employee1(String ename, int salary) {
		this.ename = ename;
		this.salary = salary;
	}
}

public class FDemo2 {

	public static void main(String[] args) {

		List<Employee1> emp = new ArrayList<Employee1>();
		emp.add(new Employee1("Ashish", 100000));
		emp.add(new Employee1("David", 30000));
		emp.add(new Employee1("John", 20000));
		emp.add(new Employee1("Papu", 60000));

		Function<Employee1, Integer> fn = e -> {
			int sal = e.salary;
			if (sal > 10000 && sal <= 20000)
				return (sal * 10 / 100);
			else if (sal > 20000 && sal <= 30000)
				return (sal * 20 / 100);
			return sal;
		};
		for(Employee1 emp1:emp) {
			int bonus = fn.apply(emp1);
			System.out.println(emp1.ename+" "+emp1.salary);
			System.out.println("Bonus is : " + bonus);
		}

	}

}

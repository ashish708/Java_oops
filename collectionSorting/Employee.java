package com.example.java.oops.collectionSorting;

public class Employee{
	// comparator interface

	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

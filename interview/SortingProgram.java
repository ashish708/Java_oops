package com.example.java.oops.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    private String name;
    private int salary;
    
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    
    @Override
    public int compareTo(Employee o) {
        if (this.salary != o.salary) {
            return Integer.compare(this.salary, o.salary);
        } else {
            return this.name.compareTo(o.name);
        }
    }
}

public class SortingProgram {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 5000));
        employees.add(new Employee("Jane", 6000));
        employees.add(new Employee("Jim", 6000));
        employees.add(new Employee("Alex", 4000));
        
        Collections.sort(employees);
        
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getSalary());
        }
    }
}



//This program uses the Comparable interface to implement the sorting logic. The compareTo method compares the employees based on their salary, and 
//if they have the same salary, it compares them based on their name. The list of employees is then sorted using the Collections.sort method, which 
//sorts the list in ascending order based on the result of the compareTo method.






















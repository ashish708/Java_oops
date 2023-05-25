package com.example.java.oops.lambda;

@FunctionalInterface
interface CalculatorDemo {
//	void switchOn();
	int add(int a, int b);
}

public class Calculator {
	public static void main(String[] args) {
		// lambda expression example
//		CalculatorDemo cal  = ()-> System.out.println("Switch on");
//		cal.switchOn();

		// ex-2
		CalculatorDemo calculatorDemo = (a, b) -> a + b;
		System.out.println(calculatorDemo.add(10, 20)); 

	}
}

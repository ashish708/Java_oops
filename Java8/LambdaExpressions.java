package com.example.java.oops.Java8;

@FunctionalInterface
interface Demo {
//	String sayHello(String name);
	public void bookCab();
}

public class LambdaExpressions {

	public static void main(String[] args) {
		
		Demo cab=()->System.out.println("Ashish");
		cab.bookCab();
		
//		HelloWorld helloWorld = (String name) -> {
//			return "Hello " + name;
//		};
//		System.out.println(helloWorld.sayHello("Ashish"));

	}

}

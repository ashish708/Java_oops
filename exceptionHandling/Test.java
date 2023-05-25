package com.example.java.oops.exceptionHandling;

public class Test {
	
	void div(int a, int b) throws ArithmeticException {
		if(b==0) {
			throw new ArithmeticException();
		}
		else {
			int c=a/b;
			System.out.println(c);
		}
	}

	public static void main(String[] args) throws ArithmeticException{
		// throw and throws 
		
		Test t = new Test();
		t.div(10, 0);
	}

}

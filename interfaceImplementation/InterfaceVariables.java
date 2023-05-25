package com.example.java.oops.interfaceImplementation;

interface CustomerRaj {
	int amt = 5; // public+static+final

	void purchase(); // public+abstract
}

class SellerSanju implements CustomerRaj {
	@Override
	public void purchase() {
		// amt=5 is final we cannot change otherwise it will give error
		System.out.println("Raj needs " + amt + " Kg rice");
	}
}

public class InterfaceVariables {

	public static void main(String[] args) {
		// interface variables
		CustomerRaj s = new SellerSanju();
		s.purchase();
		System.out.println(CustomerRaj.amt); // static varibale doesnot need object to call.
	}

}

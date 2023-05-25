package com.example.java.oops.exceptionHandling;

//custom exception
public class CustomExcep extends Exception {
	
	CustomExcep(){
		super("age is invalid");//super keyword is used to call intermediate parent constructor.
	}
	
	CustomExcep(String message){
		super(message);
	}
}

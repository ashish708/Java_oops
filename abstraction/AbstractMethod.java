package com.example.java.oops.abstraction;

abstract class Programming {

	public abstract void Developer();
	public abstract void Rank();
}

abstract class Html extends Programming {

	@Override
	public void Developer() {
		System.out.println("Tim Berners Lee");
	}
//	@Override
//	public void Rank() {
//		System.out.println("3rd");		
//	}
}

 class Java extends Html {
	
//	@Override
//	public void Developer() {
//		System.out.println("James Gosling");
//	}

	@Override
	public void Rank() {
		System.out.println("3rd");
	}
}

public class AbstractMethod {

	public static void main(String[] args) {
		Programming  h = new Java();
//		Java j = new Java();
		h.Developer();
		h.Rank();
//		j.Developer();
	}

}

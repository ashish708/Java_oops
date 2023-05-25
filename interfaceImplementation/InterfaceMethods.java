package com.example.java.oops.interfaceImplementation;

interface Client {
	void UIdesign(); // public + abstract

	void UIdevelop();// public + abstract
}

abstract class RajTech implements Client {

	@Override
	public void UIdesign() {
		System.out.println("Green, top menu, three dot button");
	}
}

class RahulTech extends RajTech {

	@Override
	public void UIdevelop() {
		System.out.println("HTML, CSS, JavaScript");
	}
}

public class InterfaceMethods {

	public static void main(String[] args) {
		// interface method
		RahulTech r = new RahulTech();
		r.UIdesign();
		r.UIdevelop();
	}

}

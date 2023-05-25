package com.example.java.oops.abstraction;

// in  both class one common thing is there i.e. both dog and lion can eat
abstract class Animal {

	// non-abstract method below
	Animal() {
		System.out.println("All animals..!");
	}

	public abstract void sound();
}

class Dog extends Animal {

	Dog() {
		super();
	}

	@Override
	public void sound() {
		System.out.println("Dog is barking");
	}

}

class Lion extends Animal {

	Lion() {
		super();
	}

	@Override
	public void sound() {
		System.out.println("Lion is Roar");
	}

}

public class AbstractClass {

	public static void main(String[] args) {
		// Abstract class demo
		Dog d = new Dog();
		Lion l = new Lion();
		d.sound();
		l.sound();

	}

}

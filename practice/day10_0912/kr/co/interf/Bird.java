package kr.co.interf;

import kr.co.inherit.Animal;

public class Bird extends Animal implements Flyable, Walkable {

	public Bird(String name, int age, double d) {
		super(name, age);
	}

	@Override
	public void fly() {

	}

	@Override
	public void walk() {

	}

	
}

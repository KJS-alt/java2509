package kr.co.ext;

import kr.co.interf.Flyable;
import kr.co.interf.Walkable;

public class Bird extends Animal implements Flyable, Walkable{
	
	private double wingspan;
	
	public Bird(String name, int age, double wingspan) {
		super(name, age);
		this.wingspan = wingspan;
	}

	@Override
	public void walk() {
		System.out.println("총총총 걷는다.");
	}
	
	@Override
	public void fly() {
		System.out.println("훨훨 날아요.");
	}
}

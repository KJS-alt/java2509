package kr.co.inherit;

// 개와 고양이의 공통된값과 액션
public class Animal {

	String name;
	int age;
	public Animal() {
		
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("Animal-정보출력");
	}

	public void eat() {
		System.out.println("Animal-먹는다");
	}

	public void makeSound() {
		System.out.println("Animal-소리를 낸다.");
	}
}

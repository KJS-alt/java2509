package kr.co.ext;

// 개와 고양이의 공통된값과 액션
public class Animal {

	String name;
	int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Animal(String name2, int age2) {
	
		this.name = name2;
		this.age = age2;
	}
	public Animal() {
		
	}
	public void makeSound() {
		System.out.println("소리를 냅니다.");
	}
	
	
}

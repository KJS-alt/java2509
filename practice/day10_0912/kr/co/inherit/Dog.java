package kr.co.inherit;

public class Dog extends Animal {

	String breeds;
	
	public Dog(String name, int age, String breeds) {
		super(name, age);
		this.breeds = breeds;
	}
	
	public void wagTail() {
		System.out.println("꼬리를 흔들");
	}
	@Override
	public void eat() {
		super.eat();
		System.out.println(this.name + "가 뼈다귀를 먹어요");
	}
	@Override
	public void makeSound() {
        System.out.println(this.name + "가 멍멍");
    }
}

package kr.co.inherit;

public class InheritClass {

	public InheritClass() {
		Dog dog = new Dog("멍멍이", 3, "골든리트리버");
		Cat cat = new Cat("야옹이", 2, true);
		
		System.out.println("---------개--------");
		dog.displayInfo();
		dog.eat();
		dog.makeSound();
		dog.wagTail();
		
		System.out.println("-------고양이-------");
		cat.displayInfo();
		cat.eat();
		cat.makeSound();
		cat.climb();
	}
}

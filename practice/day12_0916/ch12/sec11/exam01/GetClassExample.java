package ch12.sec11.exam01;

public class GetClassExample {
	public static void main(String[] args) throws Exception {
		Class clazz = Car.class;

		Class clazz2 = Class.forName("ch12.sec11.exam01.Car");

		Car car = new Car();
		Class clazz3 = car.getClass();

		System.out.println("패키지: " + clazz.getPackage().getName());
		System.out.println("패키지: " + clazz.getSimpleName());
		System.out.println("패키지: " + clazz.getName());

		System.out.println("패키지2: " + clazz2.getPackage().getName());
		System.out.println("패키지2: " + clazz2.getSimpleName());
		System.out.println("패키지2: " + clazz2.getName());

		System.out.println("패키지3: " + clazz3.getPackage().getName());
		System.out.println("패키지3: " + clazz3.getSimpleName());
		System.out.println("패키지3: " + clazz3.getName());
	}
}

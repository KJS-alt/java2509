package kr.co.cls;

public class BasicClass {
	public BasicClass() {
		
//		new키워드: 객체obj 생성
		/*
		 * Student st1 = new Student(); Student st2 = new Student();
		 */
	
//		필드값 생성
		/*
		 * st1.name = "김철수"; st1.age = 20; st1.studentId = "2050715"; st2.name = "이영희";
		 * st2.age = 24; st2.studentId = "2050716";
		 */
//		객체 생성과 초기화init
		Student st1 = new Student("김철수", 20, "2050715");
		Student st2 = new Student("이영희", "2050716");
		
//		setName(String name)
		st1.setName("김갑수");
		
//		getName()
//		use1
		System.out.println("getName() : " + st1.getName());
//		use2
		String myName = st1.getName();
		System.out.println("myName : " + myName);
		
		
		
//		 함수(클래스 안에 있는) == 메서드 호출
		st1.introduce();
		st1.study();
		System.out.println(st1.toString());
		st2.introduce();
		st2.study();
		
	}
}

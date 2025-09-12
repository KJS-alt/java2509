package kr.co.cls;

public class Student {

	private String name;
	int age;
	private String studentId;
	
	
	
	
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	
	
	
	//	전체 필드를 사용자에게 입력받는 생성자 constr
	public Student(String name, int age, String studentId) {

		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
//	필수 입력 필드를 사용자에게 입력받는 생성자 constr
	public Student(String name, String studentId) {

		this.name = name;
		this.studentId = studentId;
	}

	void introduce() {
		System.out.println(this.name + "를 소개합니다.");
	}
	
	void study() {
		System.out.println(this.studentId + "번이 공부합니다.");
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
	}
	
	
}

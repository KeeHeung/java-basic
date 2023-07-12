package java08_abstract;

//자식클래스

public class Student extends Person {
	//멤버필드
	//수강과목
	private String subject;
	
	//매개변수있는 생성자(상속)
	public Student(String name, String subject) {
		super(name);
		this.subject = subject;
	}
	
	@Override
	public void display() {
		System.out.println("[학생] " + name + ", " + subject + " 수강");
	}
	
}

package java08_abstract;

//자식클래스

public class Professor extends Person {
	//멤버필드
	//전공
	private String major;
	
	//매개변수있는 생성자(상속)
	public Professor(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public void display() {
		System.out.println("[교수] " + name + ", " + major + " 전공");
	}
	
	

}
